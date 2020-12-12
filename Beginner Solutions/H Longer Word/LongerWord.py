def longerString(s1,s2):
    lenS1 = len(s1)
    lenS2 = len(s2)
    if lenS1 > lenS2:
        return s1 +" "+str(lenS1)
    elif lenS1 == lenS2:
        return "They are equal"+" "+str(lenS1)
    elif lenS1 < lenS2:
        return s2+" "+str(lenS2)
string1 = input()
string2 = input()
print(longerString(string1,string2))
