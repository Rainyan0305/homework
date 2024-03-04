a = eval(input())
b = a

while a != 9999:
    a = eval(input())
    if a < b:
        b = a

print(b)