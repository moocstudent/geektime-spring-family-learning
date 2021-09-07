package com.example.lambdademo.interfacefunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        getListByIds(()-> Arrays.asList("123"));
    }


    public static void getListByIds(SomeThingResolve someThingResolve){
        someThingResolve.getBondCodes().stream()
                .map(code->{
                    System.out.println("do some thing with code:"+code);
                    return code+"changed";
                }).collect(Collectors.toList())
                .forEach(System.out::println);
    }



}
