class Solution {

    public static void main(String[] args) {
        int[] mylist = {-4,-2,1,4,8};
        int solution = problemSolution(mylist);
        System.out.println(solution);
    }

    static public int problemSolution(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Check if the current number is closer to zero
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            }
            // If two numbers are equally close, pick the positive
            else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
                closest = nums[i];
            }
        }

        return closest;
    }
}