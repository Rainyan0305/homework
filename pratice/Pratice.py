def compute(n):
    F0=0;F1=1
    print("0 1 ",end="")
    for i in range(2,n):
        F2=F0+F1
        print("%d "%F2,end="")
        F0=F1;F1=F2
num=int(input())
compute(num)