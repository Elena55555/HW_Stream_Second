package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }


         public static void taskOne() {
             List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

             // Sum of even numbers
             int sumOfEvens = numbers.stream()
                     .filter(num -> num % 2 == 0)
                     .mapToInt(Integer::intValue)
                     .sum();

             System.out.println("Sum of even numbers: " + sumOfEvens);

             // Sum of odd numbers
             int sumOfOdds = numbers.stream()
                     .filter(num -> num % 2 != 0)
                     .mapToInt(Integer::intValue)
                     .sum();

             System.out.println("Sum of odd numbers: " + sumOfOdds);
         }
         public static void taskTwo (){
         List<Integer> numbers = Arrays.asList(1, 1 , 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10);
         numbers.stream()
                .distinct()
                .forEach(x-> System.out.println("Processing  " + x));
        }
}


