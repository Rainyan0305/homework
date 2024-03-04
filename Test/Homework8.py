total = 0  
number = 0  
while True:  
    a = int(input())  
    if a == -1:
        break
    else:
        total += a  
        number += 1  
print(int(total/number))