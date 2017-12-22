package com.example.spring.basics.springin5steps.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {
    MyMath myMath = new MyMath();
    @Test
    public void sumWith3Nums() {
        // MyMath.sum
        // 1,2,3 => 6

        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

}