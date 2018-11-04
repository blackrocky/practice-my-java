package com.googlecode.practicemyjava.java11;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.charset.Charset;

@Slf4j
public class IOImprovements {
    public static void main(String[] args) {
        writeBytes();
        fileReaderSpecifyCharset();
        nullInputStream();
    }

    private static void nullInputStream() {
        try (InputStream inputStream = FileInputStream.nullInputStream()) {
            int bytesRead = inputStream.read("hello".getBytes());
            log.info("Bytes read: {}", bytesRead);
        } catch (IOException e) {
            log.error("Error: {}", e);
        }
    }

    private static void fileReaderSpecifyCharset() {
        try (FileReader fileReader = new FileReader("./src/main/resources/MyPracticeFile.txt", Charset.forName("UTF-8"))) {
            char[] charBuf = new char[64];
            fileReader.read(charBuf);
            log.info("Result: {}", new String(charBuf));
        } catch (IOException e) {
            log.error("Error: {}", e);
        }
    }

    private static void writeBytes() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.writeBytes("test".getBytes());
            String result = byteArrayOutputStream.toString();
            log.info("Result: {}", result);
        } catch (IOException e) {
            log.error("Error: {}", e);
        }
    }
}
