package com.googlecode.practicemyjava.java8.closure;

import java.util.List;
import java.util.function.IntFunction;

import static com.google.common.collect.Lists.newArrayList;

public class FunctionForIntegerList {
    public static List<Integer> applyForEach(List<Integer> inputs, IntFunction<Integer> function) {
        List<Integer> result = newArrayList();
        for (int input : inputs) {
            result.add(function.apply(input));
        }
        return result;
    }

    public static List<String> applyForEachReturnString(List<Integer> inputs, IntFunction<String> function) {
        List<String> result = newArrayList();
        for (int input : inputs) {
            result.add(function.apply(input));
        }
        return result;
    }
}
