package com.hye.generics.wildcards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LowerMain {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // Example with List<Integer>
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println("Integer list: " + integerList);

        // Example with List<Number>
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("Number list: " + numberList);

        // Example with List<Object>
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.println("Object list: " + objectList);

        // Example with List<Comparable>
        List<Comparable> comparableList = new ArrayList<>();
        addNumbers(comparableList);
        System.out.println("Comparable list: " + comparableList);

        // Example with LinkedList<Object>
        List<Object> linkedObjectList = new LinkedList<>();
        addNumbers(linkedObjectList);
        System.out.println("Linked Object list: " + linkedObjectList);
    }
}
