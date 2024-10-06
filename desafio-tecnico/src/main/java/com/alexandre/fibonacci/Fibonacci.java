package com.alexandre.fibonacci;

public class Fibonacci {

    public boolean pertenceAFibonacci(int valor) {
        int a = 1;
        int b =1;

        while (b<=valor) {
            int temp = a + b;
            a = b;
            b = temp;
            if (b == valor) return true;
        }
        return false;
    }
}
