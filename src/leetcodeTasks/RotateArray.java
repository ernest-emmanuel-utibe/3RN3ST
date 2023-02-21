package leetcodeTasks;

import java.util.ArrayList;

public class RotateArray {
    public static ArrayList<Integer> rotate(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % 2 == 0) {
                if (i % 2 == 0) {
                    result.add(nums[nums.length - 1 - i / 2]);
                }
                else {
                    result.add(nums[nums.length / 2 - (i + 1) / 2]);
                }
            }
            else {
                if (i % 2 == 0) {
                    if (i== nums.length - 1) {
                        result.add(nums.length/2,nums[nums.length - 1]);
                    }
                    else{
                        result.add(nums[nums.length - 2 - i / 2]);
                    }
                }
                else {
                    result.add(nums[nums.length / 2 - (i + 1) / 2]);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(rotate(numbers));
    }
}
