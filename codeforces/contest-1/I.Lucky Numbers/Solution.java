package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();

        int second_digit = num/10;

        int first_digit = num-(second_digit*10);

    if(first_digit ==0){
        System.out.println("Yes");
        return;

    }
        if((second_digit % first_digit ==0)||(first_digit %second_digit ==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
