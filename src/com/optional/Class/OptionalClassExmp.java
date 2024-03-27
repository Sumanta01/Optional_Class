package com.optional.Class;

import java.util.Arrays;
import java.util.Optional;

public class OptionalClassExmp {
    public static void main(String[] args) {
        String []str=new String[10];
        Optional<String>op=Optional.ofNullable(str[5]);
        if(op.isPresent()){
            String res=str[5].toLowerCase();
            System.out.println(res);
        }else{
            System.out.println("Value is not present");
        }


    }
}
