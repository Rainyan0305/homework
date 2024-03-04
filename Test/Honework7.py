def tribonacci(n):
    tribonacci_seq = [0, 1, 1]
    for i in range(3, n):
        next_term = tribonacci_seq[i-1] + tribonacci_seq[i-2] + tribonacci_seq[i-3]
        tribonacci_seq.append(next_term)
    return tribonacci_seq

while True:
        # 持續讀取輸入
        line = input()
        if not line:
            break

        n = int(line)
        result = tribonacci(n)
        print(result)

while line == "EOF":
        break
