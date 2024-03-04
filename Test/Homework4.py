def calculate_earnings(production, prices):
    total_production = sum(production)
    total_earnings = round(total_production * prices, 2)
    return total_production, total_earnings


# 讀取發電廠的電力產出
production_list = []
while True:
    production = int(input())
    if production == -1:
        break
    production_list.append(production)

# 讀取查詢次數
queries = int(input())

# 計算每次查詢的結果
for _ in range(queries):
    L, R = map(int, input().split())
    selected_production = production_list[L-1:R]  # 因為索引從 0 開始，所以要 -1
    total_production, total_earnings = calculate_earnings(selected_production, 3)
    print(f"編號 {L} ~ 編號 {R} 的工廠總共產出了 {total_production} 度電，賺了 {total_earnings} 元。")


