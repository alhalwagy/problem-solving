package com.hlwg;

public class Solution {
  public int lengthOfLastWord(String s) {

    String[] arr = s.split(" ");

    String result = arr[arr.length - 1];

    return result.length();


//    String trimmed = s.trim();
//    return trimmed.length() - trimmed.lastIndexOf(" ") - 1;
  }
}