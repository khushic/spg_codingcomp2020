def sort(n):
    sorted = []
    while len(n) > 0:
        min_val = min(n)
        sorted.append(min_val)
        n.remove(min_val)
    return sorted

n = input()
n_list = n.split(", ")
n_ints = []
for i in n_list:
    n_ints.append(int(i))

print(sort(n_ints))