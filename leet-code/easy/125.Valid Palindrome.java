// First Solution More Memory management

// class Solution {
//  public boolean isPalindrome(String s) {
//
//    String[] arr = s.split(" ");
//
//    StringBuilder res = new StringBuilder();
//
//    for (String word : arr) {
//      for (char c : word.toCharArray()) {
//        if (Character.isLetterOrDigit(c)) {
//
//          res.append(c);
//
//        }
//      }
//
//    }
//    String cleanStr = res.toString().toLowerCase();
//    System.out.println(res);
//    StringBuilder reversStr = new StringBuilder(cleanStr).reverse();
//    System.out.println(reversStr);
//
//    return cleanStr.equals(reversStr.toString());
//
//  }
// }


// Solution For more optimized in runtime and more memory usage  O(n) -- TWO Pointers

class Solution {
  public boolean isPalindrome(String s) {

    int i = 0;
    int j = s.length() - 1;

    while (i < j) {

      char ch1 = s.charAt(i);
      char ch2 = s.charAt(j);

      if (ch1 >= 65 && ch1 <= 90) ch1 = (char) (ch1 + 32);
      if (ch2 >= 65 && ch2 <= 90) ch2 = (char) (ch2 + 32);

      boolean c1 = (ch1 >= 97 && ch1 <= 122) || (ch1 >= 48 && ch1 <= 57);
      boolean c2 = (ch2 >= 97 && ch2 <= 122) || (ch2 >= 48 && ch2 <= 57);

      if (!c1) {
        i++;
        continue;
      }
      if (!c2) {
        j--;
        continue;
      }

      if (ch1 != ch2) return false;

      i++;
      j--;
    }

    return true;
  }
}
