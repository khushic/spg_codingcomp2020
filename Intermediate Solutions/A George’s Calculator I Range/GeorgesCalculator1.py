def range1(n):
    max = n[0];
    min = n[0];
    for i in n:
        if i > max:
            max = i
        if i < min:
            min = i
    return max - min

def range2(n):
    max = max(n)
    min = min(n)
    return max-min

n = input()
n_list = n.split(", ")
n_ints = []
for i in n_list:
    n_ints.append(int(i))

print(range1(n_ints))
#print(range2(n_ints))