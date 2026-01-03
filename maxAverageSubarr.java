import java.util .*;
 class maxAverageSubarr {
    public static void main(String [] args){
        int[] myArr  = {-1,-2,-3,-9,8,10,23};
        int k = 3;

        double result = maxAvg(myArr, k);
        System.out.println(result);
    }

    public static double maxAvg(int [] myArr , int k){
     int windowSum = 0;
     for(int i=0;i<k;i++) {
         windowSum += myArr[i];
     }
         int maxSum = windowSum;
         for(int i = k ;i< myArr.length;i++){
             windowSum += myArr[i];
             windowSum -= myArr[i-k];

             maxSum = Math.max(maxSum, windowSum);
         }


     double maxAvg = (double) maxSum/k;

        return maxAvg;
    }

}
