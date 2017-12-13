package com.example.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Inside quickSort");
        return numbers;
    }
}
