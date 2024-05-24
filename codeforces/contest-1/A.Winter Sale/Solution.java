package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        List<Integer> aa = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int discount= scanner.nextInt();
        double priceAfterDiscount = scanner.nextDouble();

        double priceBeforeDiscount = priceAfterDiscount * 100/(100-discount);


 priceBeforeDiscount= Math.floor(priceBeforeDiscount*100 +0.5)/100;
        
        System.out.println(priceBeforeDiscount);


    }

}