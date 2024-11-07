import java.util.HashMap;

public class Solution {
    
    
    public static void main(String[] args) {
        String s = "gabriel";
        String t = "leibagr";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // se tiver tamanho diferente ja quebra
        }

        //  cria um mapa pra contar as ocorrencias de cada caracter
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) { // adiciona os caracteres de s
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // subtrai as ocorrências de cada caractere em t do mapa
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false; // Caractere em t nao existe em s
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0) {
                return false; // mais ocorrencias de c em t do que em s
            }
        }
        return true; // se passar por tudo
    }
}