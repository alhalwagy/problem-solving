package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double m = scanner.nextDouble();
        double b = scanner.nextDouble();


        double res = (e*m)/b;

        long num = (long)res;

        double fin = res - num ;

        double epsilon = 1e-9;

        if(fin > 1e-9 || fin < -1e-9){
            System.out.println("double");

            return ;
        }

        if(num>2147483647){
            System.out.println("long long");
        }else{
            System.out.println("int");
        }

        

    }

}
