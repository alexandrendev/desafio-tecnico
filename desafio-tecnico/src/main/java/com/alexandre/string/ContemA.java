package com.alexandre.string;

public class ContemA {

    public int contemA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count ++;
            }
        }
        return count;
    }
}
