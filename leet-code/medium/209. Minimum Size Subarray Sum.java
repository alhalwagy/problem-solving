class Solution {
  public int minSubArrayLen(int target, int[] nums) {

    // O(N) Solution

    // int sum = 0;
    // int r, l = 0;

    // int len = Integer.MAX_VALUE;

    // for (r = 0; r < nums.length; r++) {
    // sum = sum + nums[r];

    // while (sum >= target) {
    // len = Math.min(len, r - l + 1);

    // sum = sum - nums[l];
    // l++;
    // }

    // }

    // return len == Integer.MAX_VALUE ? 0 : len;

    //O(N log N) Solution

    int n = nums.length;
    int[] prefix = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      prefix[i] = prefix[i - 1] + nums[i - 1];
    }

    int minLen = Integer.MAX_VALUE;

    for(int i =0;i<n;i++){
      int targetsum = target+prefix[i];
      int j = Arrays.binarySearch(prefix, targetsum);

      if (j < 0) {
        j = -j - 1;
      }

      if (j <= n) {
        minLen = Math.min(minLen, j - i);
      }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;

  }
}