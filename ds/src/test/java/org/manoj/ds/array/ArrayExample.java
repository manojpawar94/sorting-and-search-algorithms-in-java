package org.manoj.ds.array;

import org.junit.After;
import org.junit.Test;

public class ArrayExample {
    @Test
    public void intArrayTest(){
        int [] number = new int[7];
        number[0] = 27;
        number[1] = 12;
        for (int num : number) {
            System.out.print(num + ", ");
        }
    }

    @Test
    public void stringArrayTest(){
        String [] strArray = new String[5];
        strArray[0] = "Manoj";
        strArray[1] = "Raja";
        strArray[2] = "Sai";
        strArray[3] = "Krushana";
        for (String string : strArray) {
            System.out.print(string + ", ");
        }
    }

    @After
    public void afterTestEnd(){
        System.out.println();
    }
}