a = eval(input())
b = eval(input())
while a != -9999:
    c = b/(a/100)**2
    if c < 18.5:
        print("BMI: %.2f"%c)
        print("State: under weight")
    elif 18.5<= c < 25:
        print("BMI: %.2f"%c)
        print("State: normal")
    elif 25<= c < 30:
        print("BMI: %.2f"%c)
        print("State: over weight")
    elif 30 <= c :
        print("BMI: %.2f"%c)
        print("State: fat")
    a = eval(input())
    if a != -9999:
        b = eval(input())