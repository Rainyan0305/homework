Set=set()
while True:
    n=eval(input())
    if n == -9999:
        break
    Set.add(n)
print("Length:",len(Set))
print("Max:",max(Set))
print("Min:",min(Set))
print("Sum:",sum(Set))