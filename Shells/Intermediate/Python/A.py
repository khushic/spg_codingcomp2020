def range(n):
    #TYPE CODE HERE
    return -1

n = input()
n_list = n.split(", ")
n_ints = []
for i in n_list:
    n_ints.append(int(i))

print(range(n_ints))