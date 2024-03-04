L = []
L1 = []
while True:
    a = eval(input())
    if a == -9999:
        break
    L.append(a)
T = tuple(L)
print(T)
print("Length:",len(T))
print("Max:",max(T))
print("Min:",min(T))
print("Sum:",sum(T))
    
       
    


   
