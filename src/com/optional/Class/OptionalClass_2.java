package com.optional.Class;

import java.util.Optional;

public class OptionalClass_2 {
    public static void main(String[] args) {
        String str[]=new String[10];
         str[5]="one day i will become a good cp coder !";
        //str[5]=null;
        Optional<String>op=Optional.ofNullable(str[5]);
        if(op.isPresent()){
            String res=str[5].toUpperCase();
            System.out.println(res);
        }else{
            System.out.println("Value is not present !");
        }
    }
}
