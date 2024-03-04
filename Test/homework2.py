# 讀取測資組數
while True:
        start = int(input())
        end = int(input())

        interval_sum = sum(range(start, end + 1))

        print(interval_sum)