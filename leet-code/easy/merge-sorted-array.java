
//The traditional solution

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//
//        for(int i =0,j=m;i<n;i++){
//
//            nums1[j]= nums2[i];
//            j++;
//
//        }
//        Arrays.sort(nums1);
//    }

//Optimum solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        while(j>=0){

            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;

            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }

        }
