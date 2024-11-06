import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int out = 0;

        // criacao do set usando hashset e parametro de Character
        Set<Character> jewels_set = new HashSet<>();

        // adiciona cada joia ao set
        for (int i = 0; i < jewels.length(); i++) {
            jewels_set.add(jewels.charAt(i));
        }

        // verificando as pedras pra ver quantas joias da pra fazer
        for (int i = 0; i < stones.length(); i++) {
            if (jewels_set.contains(stones.charAt(i))) {
                out += 1;
            }
        }

        return out;
    }

}
