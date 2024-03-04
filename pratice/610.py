temp=[]
for i in range(4):
    print("Week %d:"%(i+1))
    for j in range(3):
        a=float(input("Day %d:" %(j+1)))
        temp.append(a)
print("Average: %.2f"%(sum(temp)/len(temp)))
print("Highest:",max(temp))
print("Lowest:",min(temp))