package com.example.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Inside quickSort");
        return numbers;
    }

    @PostConstruct
    public void postConstruct() {
        logger.debug("---------> postConstruct");
    }
}
