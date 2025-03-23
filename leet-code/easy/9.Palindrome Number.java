class Solution {
  public boolean isPalindrome(int x) {
    String num = Integer.toString(x);

    for (int i = num.length() - 1; i >= 0; i--) {
      if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}