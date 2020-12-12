def stringpyramid(n):
    for i in range(1, len(n)+1):
        print(n[0:i])


n = input()
stringpyramid(n)