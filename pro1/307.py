a = eval(input())
for i in range(1,a+1):
    for x in range(1,a+1):
        print("%-2d*%-2d= %-4d"%(i,x,x*i), end="") 
    print()