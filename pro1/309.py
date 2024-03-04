import math
a = eval(input())
b =0
for i in range(2,a+1):
    b += 1/(math.sqrt(i-1)+math.sqrt(i))
print("%+.4f"%b)
    