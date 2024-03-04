total = eval(input())

for i in range(total):
    num = eval(input())
    
    tmp = num
    sum_dight = 0
    while tmp != 0:
        sum_dight += tmp%10
        tmp //= 10
        
    print("Sum of all digits of %d is %d" %(num,sum_dight))