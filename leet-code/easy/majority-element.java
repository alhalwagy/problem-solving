class Solution {
    public int majorityElement(int[] nums) {
        int counter = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1)
                return nums[0];
            if (counter > (nums.length / 2))
                return nums[i - 1];
            if (nums[i] == nums[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }

        }
        return 1;
    }
}