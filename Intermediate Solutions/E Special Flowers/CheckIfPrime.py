def prime(n):
    isPrime = True
    if n == 1:
        return False
    for i in range(int(n**0.5)):
        if n%(i+1) != 0:
            isPrime = False
    return isPrime

n = int(input())
print(prime(n))