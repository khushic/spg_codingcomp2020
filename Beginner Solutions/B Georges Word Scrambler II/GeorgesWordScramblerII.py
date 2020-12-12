def partOfString(word,a,b):
    stringPart = word[a:b]
    return stringPart

string1 = input("")
index1=int(input(""))
index2 = int(input(""))
print(partOfString(string1,index1,index2+1))