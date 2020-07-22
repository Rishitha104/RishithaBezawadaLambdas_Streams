package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String args[]) {
        IntStream stream=IntStream.of(10,15,20,30,45,50,70,80,90);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println("Stream Average : " +obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}