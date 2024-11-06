import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    
    public static void main(String[] args) {
        int[] values = {1,2,3,4};
        System.out.println(containsDuplicate(values));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> nums_set = new HashSet<>();

        for (int num : nums) {
            // se ja estiver no conjunto, esta duplicado
            if (!nums_set.add(num)) {
                return true;
            }
        }

        return false;

    }
}
