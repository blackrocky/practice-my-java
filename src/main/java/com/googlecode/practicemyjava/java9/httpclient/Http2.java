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

public class Http2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Http2.class);

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .version(HttpClient.Version.HTTP_2)
                .headers("text", "hello", "day", "sunday")
                .timeout(Duration.of(5, ChronoUnit.SECONDS))
                .GET()
                .build();

        HttpResponse<String> getResponse = HttpClient.newBuilder().build().send(getRequest, HttpResponse.BodyHandlers.ofString());
        LOGGER.info("Response body: {}", getResponse.body());

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
    }
}
