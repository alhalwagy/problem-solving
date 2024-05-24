package com.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int odd_num = scanner.nextInt();
        int even_num = scanner.nextInt();

        if(odd_num==0 && even_num ==0){
            System.out.println("NO");
            return;
        }
        if(odd_num-even_num ==1|| even_num-odd_num ==1 ||even_num-odd_num ==0){
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
        

    }

}
