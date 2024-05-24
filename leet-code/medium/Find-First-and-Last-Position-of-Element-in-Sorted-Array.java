class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =0, right = nums.length-1;
        int [] ans ={-1,-1};
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                ans[0]=mid;
                ans[1]=mid;
                for(int i=mid+1;i<nums.length;i++){
                    if(nums[i]==target)
                        ans[1]=i;
                    else
                        break;
                }
                for(int i=mid-1;i>=0;i--){
                    if(nums[i]==target)
                        ans[0]=i;
                    else
                        break;
                }
                break ;
            }
        }
        return ans;
    }
}