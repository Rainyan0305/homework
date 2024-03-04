def draw_diamond(size):
    for i in range(size):
        print(" " * (size - i - 1) + "*" * (2 * i + 1))
    for i in range(size - 2, -1, -1):
        print(" " * (size - i - 1) + "*" * (2 * i + 1))

while True:
    size = int(input())
    if size == -1:
        break
    draw_diamond(size)

