import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {3,1,2,5};
        int tgt = 8;
        int[] result = twoSum(numbers, tgt);
        
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2]; // positions i and j
        boolean foundIt = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    foundIt = true;
                    break;
                }
                }
            if (foundIt) {
                break;
            }
        }
        return result;
    }
}
