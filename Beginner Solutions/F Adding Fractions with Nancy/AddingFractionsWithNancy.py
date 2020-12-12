def addFrac(n1,d1,n2,d2):
    finald = d1*d2
    finaln1 = n1 * d2
    finaln2 = n2 * d1
    finaln = finaln1+finaln2
    return str(finaln)+"/"+str(finald)
num1 = int(input())
denom1= int(input())
num2 = int(input())
denom2 = int(input())
print(addFrac(num1,denom1,num2,denom2))