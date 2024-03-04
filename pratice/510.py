import math
def compute(p,q):
    return math.gcd(p,q)
a,b = map(int,input().split(","))
c,d = map(int,input().split(","))
q = b*d
p=a*d+b*c
GCD=compute(p,q)
p=p/GCD
q=q/GCD
print("%d/%d + %d/%d = %d/%d" %(a,b,c,d,p,q))
