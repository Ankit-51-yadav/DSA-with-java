public class missingNumber {
    public static void main(String[] args) {
        int [] nums = {1,2,0,3};

        Solution sol = new Solution();
        int result = sol.missingNumber(nums);
        System.out.println(result);


    }
    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;

            int expectSum =( n*(n+1))/2;
            int currSum =0;
            for (int i = 0; i<nums.length;i++){
                currSum += nums[i];
            }
            return (int) expectSum - currSum;
        }

    }
}
