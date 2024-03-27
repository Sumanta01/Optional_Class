package com.optional.Class;

import java.util.Optional;

public class Optional_Examples{
    public static void main(String[] args) {
        Optional<String>op=Optional.of("Java");

        System.out.println(op.get());

        String value=op.orElse(null);
        System.out.println(value);
        String value2=op.orElse("Python");
        System.out.println(value2);
    }
}
