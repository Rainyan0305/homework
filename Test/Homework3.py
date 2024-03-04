grades = []
while True:
    grade = int(input())
    if grade == -48763:
        break
    grades.append(grade)

sorted_grades = sorted(grades, reverse=True)
second_highest = sorted_grades[1]

print(f"系排二的成績為{second_highest}分。")

