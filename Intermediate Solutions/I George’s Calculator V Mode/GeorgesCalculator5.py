def mode(n):
    freq = {}
    max = 1
    mode = n[0]
    for i in n:
        if i in freq.keys():
            freq[i] += 1
            if freq[i] > max:
                mode = i
                freq[i] = max
        else:
            freq[i] = 1
    return mode

n = input().split(", ")
print(mode(n))