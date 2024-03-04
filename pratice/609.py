mat1=[[],[]]
mat2=[[],[]]
print("Enter matrix 1:")
for i in range(2):
    for j in range(2):
        print("[%d,%d]: "%(i+1,j+1),end="")
        mat1[i].append(int(input()))
print("Enter matrix 2:")
for i in range(2):
    for j in range(2):
        print("[%d,%d]: "%(i+1,j+1),end="")
        mat2[i].append(int(input()))
print("Matrix 1:")
for i in range(2):
    for j in range(2):
        print("%d "%mat1[i][j],end="")
    print()
print("Matrix 2:")
for i in range(2):
    for j in range(2):
        print("%d "%mat2[i][j],end="")
    print()
print("Sum of 2 matrices:")
for i in range(2):
    for j in range(2):
        print("%d "%(mat1[i][j]+mat2[i][j]),end="")
    print()