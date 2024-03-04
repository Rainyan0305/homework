def compute(a,b):
    if b == 0: return a
    else: return compute(b,a%b)

a,b = eval(input())
print(compute(a,b))