package com.googlecode.practicemyjava.java11;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class LocalVarForLambdaParameters {
    public static void main(String[] args) {
        var vegies = List.of("cucumber", "carrot", "capsicum", "broccolini");
        List<String> result = vegies.stream()
                .map((@NonNull var s) -> s.toUpperCase())
                .collect(Collectors.toList());
        log.info("result: {}", result);
    }
}
