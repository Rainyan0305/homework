a = int(input())
b=float(input())
c=int(input())
print("Month \t  Amount")
for i in range(c):
    a +=a*b/1200
    print("%3d \t %.2f"%(i+1,a))