class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # cria string para armazenar valores
        output = ""
        # descobre comprimento da menor string
        l = min(len(word1),len(word2))
        # percorre o menor comprimento e adiciona na string
        for i in range(l):
            output += word1[i] + word2[i]
        # adiciona o que falta
        if len(word1)>l:
            output += word1[l:]
        if len(word2)>l:
            output += word2[l:]
        return output