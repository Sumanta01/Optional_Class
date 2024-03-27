package com.optional.Class;

import java.util.Optional;

public class Creating_OptionalClass {
    public static void main(String[] args) {

        Optional<String>op= Optional.empty();
        System.out.println(op);

        Optional<String>op2= Optional.of("Sumanta");
        System.out.println(op2.get());

        String val=null;
        Optional<String>res=Optional.ofNullable(val);
        System.out.println(res);



    }
}
