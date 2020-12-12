def swap(string, a, b):
    stringList = []
    swapChar = string[a]
    for i in string:
        stringList.append(i)
    finalString = ""
    stringList[a] = stringList[b]
    stringList[b] = swapChar
    for i in stringList:
        finalString = finalString + i
    return finalString


string = input()
index1 = int(input())
index2 = int(input())
print(swap(string, index1, index2))
