def factorial1(n):
    output = 1
    for i in range(n):
        output = output*(i+1)
    return output

def factorial2(n):
    if n == 1:
        return 1
    else:
        return n*factorial2(n-1)

n = int(input())

#print(factorial1(n))
print(factorial2(n))