package org.example.pizza;
import org.example.pizza.pizzaClasses.Pizza;
//1 уровень сложности: 1 Создайте класс Пицца с минимум 5 полями.
// Реализуйте внутренний класс-строитель, помогающий компоновать объект Пицца.

//3
public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .isTomato(true)
                .isSalami(true)
                .isThin(true)
                .isOnion(false)
                .build();
        System.out.println(pizza);
    }
}