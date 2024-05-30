class Solution {
  public int maxArea(int[] height) {

    // Optimum solution with O(N) --TWO Pointers

    int res = 0;
    int width = 0;
    int high = 0;
    int r= height.length-1;
    int l = 0;

    while(l<r){

      width=r-l;
      high = Math.min(height[r],height[l]);
      int area = width * high;
      if(res<area){
        res = area;
      }
      if(height[l]<height[r]){
        l++;
      }else{
        r--;
      }


    }
    return res;



    // trivial sol with nested loop-------------


//    int res = 0;
//    int width = 0;
//    int high = 0;
    // for (int i = 0; i < height.length; i++) {

    //     for (int j = i + 1; j < height.length; j++) {

    //         width = j - i;
    //         high = Math.min(height[i], height[j]);

    //         int test = width * high;
    //         if (res < test) {
    //             res = test;
    //         }
    //     }

    // }

    // return res;

  }
}