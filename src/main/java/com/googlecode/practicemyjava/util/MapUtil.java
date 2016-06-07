package com.googlecode.practicemyjava.util;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static <K, V> Map.Entry<K, V> entry(final K key, final V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    public static <K, V> Map<K, V> map(final Map.Entry<K, V>... entries) {
        final Map<K, V> map = new HashMap<>();
        for (final Map.Entry<K, V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
