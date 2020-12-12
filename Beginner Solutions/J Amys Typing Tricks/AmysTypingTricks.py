def spaces(s1):
    stringList = []
    for i in s1:
        stringList.append(i);
    finalString = ''
    for i in stringList:
        if i != " ":
            finalString = finalString + i + " "
        else:
            finalString = finalString + i
    return finalString
string1 = input()
print(spaces(string1))