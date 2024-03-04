def check_result(scores):
    for i in range(1, len(scores)):
        if scores[i] < scores[i-1]:
            return "nullptr 大電神又再裝弱，強烈譴責"
    return "nullptr 大電神成功了Orz"

scores = []

while True:
    score = int(input())
    if score == -48763:
        break
    scores.append(score)

result = check_result(scores)
print(result)
