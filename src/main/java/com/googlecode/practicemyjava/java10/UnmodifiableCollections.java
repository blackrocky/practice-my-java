package com.googlecode.practicemyjava.java10;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class UnmodifiableCollections {
    public static void main(String[] args) {
        var vegies = List.of("cucumber", "carrot", "capsicum", "broccolini");
        var copyOfVegies = List.copyOf(vegies);
        var vegiesStartingWithC = vegies.stream()
                .filter(v -> StringUtils.startsWith(v, "c"))
                .collect(Collectors.toUnmodifiableList());

        try {
            copyOfVegies.add("celery");
        } catch (UnsupportedOperationException e) {
            log.error("Can't add to unmodifiable list copyOfVegies");
        }

        try {
            vegiesStartingWithC.add("celery");
        } catch (UnsupportedOperationException e) {
            log.error("Can't add to unmodifiable list vegiesStartingWithC");
        }
    }
}
