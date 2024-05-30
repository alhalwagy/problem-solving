class Solution {
  public int[] sortedSquares(int[] nums) {

    int l = 0;
    int r = nums.length - 1;

    int[] res = new int[nums.length];
    int pointer = res.length - 1;
    while (l <= r) {
      int left = nums[l]*nums[l];
      int right = nums[r]*nums[r];
      if (left < right) {
        res[pointer] = right;
        r--;
        pointer--;
      } else {
        res[pointer] = left;
        l++;
        pointer--;

      }
    }
    return res;
  }
}