L=[]
with open("read.txt","r",encoding="utf-8") as file:
    for line in file:
        print(line)
        L.append(line.split())
n=len(L)
name=[L[i][0]for i in range(n)]
H=[eval(L[i][1])for i in range(n)]
W=[eval(L[i][2])for i in range(n)]

print("Average height: %.2f"%(sum(H)/n))
print("Average weight: %.2f"%(sum(W)/n))
MaxH=max(H); MaxW=max(W)
print("The tallest is %s with %.2fcm" %(name[H.index(MaxH)],MaxH))
print("The heaviest is %s with %.2fkg" %(name[W.index(MaxW)],MaxW))