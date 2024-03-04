Set = set()
while True:
    a = eval(input())
    if a == -9999:
        break
    else:
        Set.add(a)
print("Length: ",(len(Set)))
print("Max: ",max(Set))
print("Min: ",min(Set))
print("Sum: ",sum(Set))