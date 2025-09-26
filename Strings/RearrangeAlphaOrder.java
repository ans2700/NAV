package Strings;

import java.util.*;

public class RearrangeAlphaOrder {

    public static void main(String[] args) {

        String s = "dhdhdbajjf";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    // swap
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        String n = new String(c);
        System.out.println("Sorted: " + n);
    }
