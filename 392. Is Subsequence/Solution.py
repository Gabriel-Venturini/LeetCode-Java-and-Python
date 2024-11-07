# Given two strings s and t, 
# return true if s is a subsequence of t, or false otherwise.
# i.e., "ace" is a subsequence of "abcde" while "aec" is not).

def isSubsequence(s: str, t: str) -> bool:
    s_pointer = 0
    t_pointer = 0

    while s_pointer < len(s) and t_pointer < len(t):
        # se o caractere atual de t coincide com o de s avança em s
        if s[s_pointer] == t[t_pointer]:
            s_pointer += 1
        # avança sempre no ponteiro de t
        t_pointer += 1

    # se percorrer todos os caracteres de s, significa que e uma subsequencia
    return s_pointer == len(s)


w1='ab'
w2='bdb'

print(isSubsequence(w1,w2))