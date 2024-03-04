L=[]
sun = 0 
for i in range(12):
    L.append(eval(input()))
    if i%2==0: sun+=L[i]

for j in range(4):
    print("%3d%3d%3d"%(L[j*3],L[j*3+1],L[j*3+2]))
print(sun)