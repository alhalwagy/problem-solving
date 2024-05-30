class Solution {
  public int[] twoSum(int[] numbers, int target) {

    int [] res = new int[2];
    int left =0;

    int right = numbers.length-1;
    int sum = 0;

    while(left<right){
      sum = numbers[left] + numbers[right];

      if(target>sum){
        left++;
      }else if(target<sum){
        right--;
      }else{
        res[0]=left+1;
        res[1]=right+1;
        break;
      }

    }
    return res;

  }
}