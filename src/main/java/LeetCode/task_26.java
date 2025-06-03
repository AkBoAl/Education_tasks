package LeetCode;

import java.util.Arrays;


public class task_26 {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,1,2,3}; // 1,2,3,4,5,6
        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
    static public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int result = 1;
        int[] remuveNums = new int[nums.length];
        remuveNums[0] = nums[0];
        int j = 0;
            for (int i = 1; i < nums.length; i++) {
                if (remuveNums[j] != nums[i]) {
                    j++;
                    remuveNums[j] = nums[i];
                    nums[j] = remuveNums[j];
                    result++;
                }
            }
        return result;
    };
}
