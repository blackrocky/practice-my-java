package com.googlecode.practicemyjava.java9.httpclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Http2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Http2.class);

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, TimeoutException, ExecutionException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .version(HttpClient.Version.HTTP_2)
                .headers("text", "hello", "day", "sunday")
                .timeout(Duration.of(5, ChronoUnit.SECONDS))
                .GET()
                .build();

        sendSyncGetRequest(request);
        sendAsyncGetRequest(request);
        sendMultipleAsyncGetRequests();
        sendAsyncUsingExecutor(request);
        sendSyncPostRequest();
    }

    private static void sendSyncPostRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
                .build();

        HttpResponse<String> response = HttpClient.newBuilder().build().send(postRequest, HttpResponse.BodyHandlers.ofString());
        LOGGER.info("POST Response headers: {}", response.headers());
        LOGGER.info("POST Response body: {}", response.body());
    }

    private static void sendAsyncUsingExecutor(HttpRequest request) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<HttpResponse<String>> future1 = HttpClient.newBuilder()
                .executor(executorService)
                .build()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString());

        CompletableFuture<HttpResponse<String>> future2 = HttpClient.newBuilder()
                .executor(executorService)
                .build()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString());

        List<String> bodies = Stream.of(future1, future2)
                .map(f -> {
                    try {
                        return f.get().body();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return "";
                })
                .collect(Collectors.toList());

        LOGGER.info("Bodies: {}", bodies);
        executorService.shutdown();
    }

    private static void sendMultipleAsyncGetRequests() throws URISyntaxException {
        List<URI> targets = Arrays.asList(
                new URI("https://postman-echo.com/get?foo1=bar1"),
                new URI("https://postman-echo.com/get?foo2=bar2"));
        HttpClient client = HttpClient.newHttpClient();
        List<CompletableFuture<HttpResponse<String>>> futures = targets.stream()
                .map(target -> client
                        .sendAsync(
                                HttpRequest.newBuilder(target).GET().build(),
                                HttpResponse.BodyHandlers.ofString()))
                .collect(Collectors.toList());

        futures.forEach(f -> {
            try {
                LOGGER.info("Multiple async response headers: {}", f.get().headers());
                LOGGER.info("Multiple async response body: {}", f.get().body());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

    private static void sendAsyncGetRequest(HttpRequest request) throws InterruptedException, ExecutionException {
        CompletableFuture<Void> completableFuture = HttpClient.newBuilder().build().sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAccept(resp -> {
                    LOGGER.info("Async response headers: {}", resp.headers());
                    LOGGER.info("Async response body: {}", resp.body());
                });
        completableFuture.get();
    }

    private static void sendSyncGetRequest(HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());
        LOGGER.info("Response headers: {}", response.headers());
        LOGGER.info("Response body: {}", response.body());
    }
}
