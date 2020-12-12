def substring(full, sub):
    return(full.count(sub))

n = input().split(", ")
full = n[0]
sub = n[1]
print(substring(full, sub))