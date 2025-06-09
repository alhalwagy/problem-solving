 class Solution {
  public String longestCommonPrefix(String[] strs) {

    if (strs == null || strs.length == 0) {
      return "";
    }

    String prefix = strs[0];

    for (int i = 1; i< strs.length ;i++){

      String currentString = strs[i];
      int j = 0;
      while (j < prefix.length() && j < currentString.length() && prefix.charAt(j) == currentString.charAt(j)) {
        j++;

        System.out.println("j: " + j + " prefix: " + prefix + " currentString: " + currentString);

      }
      prefix = prefix.substring(0, j); //1
      System.out.println("Updated prefix: " + prefix);

    }

    // If the prefix is empty, return an empty string
    if(prefix.isEmpty()) {
      return "";
    }
    return prefix;

  }
}