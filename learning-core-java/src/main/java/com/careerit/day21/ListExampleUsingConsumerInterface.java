package com.careerit.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class ListExampleUsingConsumerInterface {
    public static void main(String[] args) {
        //generate 20 random numbers and store it in container(list)
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            int num = ThreadLocalRandom.current().nextInt(1, 100);
            list.add(num);
        }
        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer ele) {
                System.out.print(ele+" ");
            }
        };
        //Printing list elements using forEach loop
        list.forEach(consumer);
        //As it is functional interface we can make use of lambda function as well
        System.out.println("printing using lambda function");
        Consumer<Integer> consumer1=(ele)-> System.out.print(ele+" ");
        list.forEach(consumer1);
        System.out.println("lambda approach-2");
        list.forEach(ele-> System.out.print(ele+" "));

    }
}
