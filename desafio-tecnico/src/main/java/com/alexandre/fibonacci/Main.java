package com.alexandre.fibonacci;

public class Main {



    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        System.out.println("pertence a fibonacci: " + f.pertenceAFibonacci(5));
        System.out.println("pertence a fibonacci: " + f.pertenceAFibonacci(3));
        System.out.println("pertence a fibonacci: " + f.pertenceAFibonacci(16));
    }
}