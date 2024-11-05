class Solution {

    public String mergeAlternately(String word1, String word2) {
        // mais eficiente para concatenar
        StringBuilder output = new StringBuilder();
    
        // verifica quem e maior por true ou false
        boolean l = word1.length() > word2.length();

        if (l == false) { // se w1 for menor do que w2
            for (int i = 0; i < word1.length(); i++) {
                output.append(word1.charAt(i));
                output.append(word2.charAt(i));
            }
            for (int i = word1.length(); i < word2.length(); i++) {
                output.append(word2.charAt(i));
            }
        }
        else { // se w1 for maior que w2
            System.out.println("true\n");
            for (int i = 0; i < word2.length(); i++) {
                output.append(word1.charAt(i));
                output.append(word2.charAt(i));
            }
            for (int i = word2.length(); i < word1.length(); i++) {
                System.out.println("Segundo loop\n");
                output.append(word1.charAt(i));
            }
        }

        return output.toString();
    }
}
