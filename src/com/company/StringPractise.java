package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPractise {

    public static void main(String[] args) {
        List<String> strings = List.of("faaaairst", "abc", "terabc", "abc", "a2", "a9", "mnb", "last");

        Stream<String> stringStream = strings.stream().distinct().map(String::toUpperCase);

        String findFirstOrEmpty = strings.stream().findFirst().orElse("empty");

        String empty = strings.stream().reduce((e1, e2) -> e2).orElse("empty");

        String a3 = strings.stream().filter(s -> s.equals("a3")).findFirst().orElseThrow();

        Stream<String> getThirdElement = strings.stream().skip(2L).limit(1);

        Stream<String> skipAndLimit = strings.stream().skip(1L).limit(2);
    }
}
