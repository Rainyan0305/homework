rows=eval(input())
cols=eval(input())
for x in range(rows):
    for y in range(cols):
        print("%4d"%(y-x),end="")
    print()