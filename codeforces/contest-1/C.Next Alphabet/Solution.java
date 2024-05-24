package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
           String c = scanner.next();

           char test = c.charAt(0);

           int a = (int)test;

           if(a == 122){
            a = 97;
           }else{
            a = a+1;
           }

        char res = (char)a;

        System.out.println(res);
        

    }

}
