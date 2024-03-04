r1=c1=r2=c2=0
Max = -99999999999999999999999999999
Min = 999999999999999999999999999999
for i in range(3):
    for j in range(3):
        n = int(input())
        if n > Max: Max=n; r1=i; c1=j
        if n < Min: Min=n; r2=i; c2=j
    
print("Index of the largest number %d is: (%d, %d)"%(Max,r1,c1))
print("Index of the smallest number %d is: (%d, %d)"%(Min,r2,c2))