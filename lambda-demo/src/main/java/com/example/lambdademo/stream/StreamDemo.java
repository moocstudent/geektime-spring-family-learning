package com.example.lambdademo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

    public static class Student {
        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }

        private String id;
        private String name;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student jack = new Student("1", "jack");
        Student lucy = new Student("2", "lucy");

        studentList.add(jack);
        studentList.add(lucy);

        Map<String, String> idNameMap = studentList.stream()
                .collect(Collectors.toMap(s -> s.id, s -> s.name));

        System.out.println("map:"+idNameMap);
    }
}
