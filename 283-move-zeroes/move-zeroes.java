import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();

        /*
         * Collect non-zero values first
         * to preserve their original order.
         */
        for (int num : nums) {
            if (num != 0) {
                temp.add(num);
            }
        }

        /*
         * Fill the remaining positions
         * with zeroes.
         */
        while (temp.size() < n) {
            temp.add(0);
        }

        // Copy the final arrangement back into nums.
        for (int index = 0; index < n; index++) {
            nums[index] = temp.get(index);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}