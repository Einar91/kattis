problems = input().split(";")
sum = 0
for problem in problems:
    problem = problem.split("-")
    if len(problem) == 1:
        sum += 1
    else:
        sum += (int(problem[1]) - int(problem[0]) + 1)
print(str(sum))