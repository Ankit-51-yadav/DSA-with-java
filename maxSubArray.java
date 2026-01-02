
import java.util.*;

public class maxSubArray {
    public static void main(String[] args) {
        int[] newArr = {-1, 0, 2, 4, -3, 9, -5,10,-1};

        int result = newSum(newArr);
        System.out.println(result);
    }

    public static int newSum(int[] newArr) {
        int maxSum = newArr[0];

        for (int i = 0; i < newArr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < newArr.length; j++) {
                currentSum += newArr[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}

