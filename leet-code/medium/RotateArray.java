class Solution {


    public static void reverse (int nums[],int leftIndex,int rightIndex){

        while(leftIndex<rightIndex){
            int temp = nums[leftIndex];
            nums[leftIndex]=nums[rightIndex];
            nums [rightIndex]=temp;

            leftIndex++;
            rightIndex--;
        }

    }

    public void rotate(int[] nums, int k) {
        k = k %nums.length;

        if(k < 0){
            k+=nums.length;
        }

        reverse(nums,0,nums.length-k-1);

        reverse(nums,nums.length-k,nums.length-1);

        reverse(nums,0,nums.length-1);

    }}

