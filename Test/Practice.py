electricity_data = []
while True:
    n = int(input())
    if n == -1:
        break
    electricity_data.append(n)

q = int(input())

for _ in range(q):
    L, R = map(int, input().split())
    total_electricity = sum(electricity_data[L - 1:R])
    money_earned = total_electricity * 2.65 
    print(f"編號 {L} ~ 編號 {R} 的工廠總共產出了 {total_electricity} 度電，賺了 {money_earned:.2f} 元。")
