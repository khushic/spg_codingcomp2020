def average1(n):
    sum = 0
    for i in n:
        sum += i
    average = sum/len(n)
    return average

def average2(n):
    return sum(n)/len(n)

n = input()
n_list = n.split(", ")
n_ints = []
for i in n_list:
    n_ints.append(int(i))

print(average1(n_ints))
#print(average2(n_ints))