a = eval(input())
b = eval(input())
cnt = sum =0
for i in range(a,b+1):
    if (i%4==0) or (i%9==0):
        cnt += 1
        sum += i
        print("%-4d"%i,end="")
        if cnt%10==0:
            print("")
print("\n%-d\n%-d"%(cnt,sum))