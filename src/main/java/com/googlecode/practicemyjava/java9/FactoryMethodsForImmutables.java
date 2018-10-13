package com.googlecode.practicemyjava.java9;

import java.util.List;
import java.util.Map;

public class FactoryMethodsForImmutables {
    private static List<?> immutableEmptyList = List.of();
    private static List<String> immutableList = List.of("blueberry", "strawberry", "mango");
    private static Map<?, ?> immutableEmptyMap = Map.of();
    private static Map<String, String> immutableMap = Map.of("Chatswood", "North Shore", "Parramatta", "West", "Brighton Le Sand", "South");
}
