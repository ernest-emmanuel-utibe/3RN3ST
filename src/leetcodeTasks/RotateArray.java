package leetcodeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static ArrayList<Integer> rotate(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % 2 == 0) {
                if (i % 2 == 0) {
                    result.add(nums[nums.length - 1 - i / 2]);
                }
                else {
                    result.add(nums[nums.length / 2- (i + 1) / 2]);
                }
            }
            else {
                //result[nums.length / 2] = nums[nums.length - 1];

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
//        if (k > nums.length)
//            k = k % nums.length;
//        for(int i = 0; i < k; i++){
//            result[i] = nums[nums.length-k+i];
//        }
//        int j = 0;
//        for(int i = k; i < nums.length; i++){
//            result[i] = nums[j];
//            j++;
//        }
//        System.arraycopy( result, 0, nums, 0, nums.length );
        return result;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(rotate(numbers));
    }
}
