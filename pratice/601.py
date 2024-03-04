L = []
sum = 0
for i in range(12):
    a = eval(input())
    L.append(a)
    if i%2 == 0: sum+=L[i]
for j in range(4):
    print("%3d%3d%3d"%(L[j*3],L[j*3+1],L[j*3+2]))
    print(sum)