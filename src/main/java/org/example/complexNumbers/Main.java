package org.example.complexNumbers;

import org.example.complexNumbers.complexNumbersClasses.ComplexNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Если Вы знаете что такое комплексные числа, создайте неизменяемый класс комплексных чисел.
// В противном случае создайте неизменяемый класс Book, описывающий
// книгу с атрибутами, такими как название, автор и год издания.
public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        ComplexNumbers first = new ComplexNumbers(rnd.nextInt(-100, 100), rnd.nextInt(-100, 100));
        System.out.println("Add five to complex nums:" + first.addFive(first.getRealNum(), first.getImaginaryNum()));
        Map<Integer,ComplexNumbers> complexNumbersList = new HashMap<>();
         for (int i = 1; i <= 2; i++) {
                complexNumbersList.put(i, new ComplexNumbers(rnd.nextInt(-100, 100), rnd.nextInt(-100, 100)));
         }
        System.out.println("First complex num: " + complexNumbersList.get(1));
        System.out.println("Second complex num: " + complexNumbersList.get(2));

        ComplexNumbers sumResult = ComplexNumbers.sum(complexNumbersList.get(1), complexNumbersList.get(2));
        System.out.println("Sum of two complex number: " + sumResult);

    }

}
