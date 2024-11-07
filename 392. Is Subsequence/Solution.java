public class Solution {
    
    public static void main(String[] args) {

        String w1 = "xtt";
        String w2 = "acbe";
        
        System.out.println(isSubsequence(w1, w2));

    }

    public static boolean isSubsequence(String s, String t) {
        int t_pointer = 0;
        int s_pointer = 0;

        while (s_pointer < s.length() && t_pointer < t.length()) {
            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer += 1;
            }
            t_pointer += 1;
        }

        return s_pointer == s.length();
    }
}
