d = {}

while True:
    k = input("Key: ")
    if k == "end":
        break
    v = input("Value: ")
    d[k]=v
    
k=input("Search key: ")
print(k in d)