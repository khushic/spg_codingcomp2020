def repeatedlength(n):
    n_list = n.split(", ")
    n_set = set(n_list)
    return len(n_set)

n = input()

print(repeatedlength(n))