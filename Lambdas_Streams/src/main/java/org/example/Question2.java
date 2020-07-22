package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();

        list1.add("abc");
        list1.add("acb");
        list1.add("bnb");
        list1.add("ada");
        list1.add("cad");

        list1=search(list1);

        for(String i:list1) {
            System.out.println(i);
        }
    }
    static List<String> search(List<String> l1) {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}