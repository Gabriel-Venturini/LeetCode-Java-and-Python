import java.util.HashMap;

class TwoSumOptimized { 
    public int[] twoSum(int[] nums, int target) {
        // Array to hold the result indices
        int[] result = new int[2];
        
        // Create a hashmap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If found, store the indices in the result array
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return result (in case no solution is found, which shouldn't happen as per problem constraints)
        return result;
    }
}
