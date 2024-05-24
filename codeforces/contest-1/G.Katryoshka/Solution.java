package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long e = scanner.nextLong();
        long m = scanner.nextLong();
        long b = scanner.nextLong();

        long counter = 0;
        long res = 0;
        if (e == 0 || b == 0) {
            System.out.println(0);
        } else {

            if ((m >= e && m >= b) || (m >= b && m < e) || (m < b && m >= e)) {
                counter = Math.min(e, b);

                System.out.println(counter);

            }else if(m<b && m<e){
                res = m;

                e=e-m;
                b=b-m;

                res = res+Math.min(e/2, b);
                System.out.println(res);


            }

        }

    }

}
