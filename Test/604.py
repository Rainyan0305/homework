a = []
count=[0]*10
for i in range(10):
    num = int(input())
    a.append(num)
    count[a.index(num)] += 1
b = max(count)
print(a[count.index(max(count))])
print(b)
    
    