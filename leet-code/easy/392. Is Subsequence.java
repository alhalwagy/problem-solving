class Solution {
  public boolean isSubsequence(String s, String t) {
    if (s.length() > t.length())
      return false;
    int sP = 0;
    int tP = 0;
    StringBuilder res = new StringBuilder();
    while (sP < s.length() && tP < t.length()) {

      if (s.charAt(sP) != t.charAt(tP)) {
        tP++;

      } else {
        res.append(s.charAt(sP));
        sP++;
        tP++;
      }
    }

    if (s.equals(res.toString())) {
      return true;
    } else {
      return false;
    }
  }
}


// more optimized solution

//int n = s.length();
//int m = t.length();
//
//int j=0;
//        for(int i = 0;i<n;i++){
//char ch = s.charAt(i);
//
//            while(j<m && ch != t.charAt(j)) j++;
//
//    if(j>=m) return false;
//j++;
//    }
//
//    return true;