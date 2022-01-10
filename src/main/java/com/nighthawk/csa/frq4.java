package com.nighthawk.csa;

import java.util.*;

public class frq4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your string");
        String str = sc.nextLine();

        int count = 0;
        String answer = "";

        for (int i = 0; i < str.length() - 1; i++) {
            int temp = 0;
            int x = i;

            while (str.charAt(x) == str.charAt(x+1)) {
                temp ++;
                x ++;

                if (x == str.length()-1) {
                    break;
                }
            }

            if (temp > count) {
                count = temp + 1;

                answer = Character.toString(str.charAt(i));
            }

        }

        System.out.println(answer + " " + count);

    }
}
