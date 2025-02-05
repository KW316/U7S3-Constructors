package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallenge {
    // Problem 22
   
    public static int doubleTheSum(int a, int b){
        int sum = a + b;
        if(a == b){
            sum = (a+b)*2;
        }
        return sum;
    }
    public static boolean lookOut10(int a, int b){
                    if(a == 10 || b == 10){
                        return true;
                    }else if(a + b == 10){
                        return true;
                    }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleTheSum(1, 2));
        System.out.println(doubleTheSum(3, 2));
        System.out.println(doubleTheSum(2, 2));
        System.out.println(lookOut10(9, 10));
        System.out.println(lookOut10(9, 9) );
        System.out.println(lookOut10(1, 9));
    }
}
