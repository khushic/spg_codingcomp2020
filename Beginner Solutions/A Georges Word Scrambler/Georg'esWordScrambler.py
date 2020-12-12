def partOfString(word,a,b):
    stringPart = word[a:b]
    return stringPart

string1 = input("What is George's word?")
index1= int(input("What is the first index?"))
index2 = int(input("What is the second index?"))
print(partOfString(string1,index1,index2+1))