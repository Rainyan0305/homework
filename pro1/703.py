L = []
while True:
    a = input()
    if a == "end": 
        break
    L.append(a)
T = tuple(L)
print(T)