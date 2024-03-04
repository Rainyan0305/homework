L =[]
for i in range(2):
    print("Create tuple%d:"%(i+1))
    while True:
        a = eval(input())
        if a == -9999:
            break
        L.append(a)
T = tuple(L)
L.sort()
print("Combined tuple before sorting:",T)
print("Combined list after sorting:",L)