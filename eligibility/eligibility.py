def is_eligble(name, study_start, birthday, courses):
    s_year, s_month, s_day = study_start.split("/")
    b_year, b_month, b_day = birthday.split("/")
    start_limit = 2010
    birthday_limit = 1991

    if int(s_year) >= start_limit:
        print(f"{name} eligible")
    elif int(b_year) >= birthday_limit:
        print(f"{name} eligible")
    elif courses >= 41:
        print(f"{name} ineligible")
    else:
        print(f"{name} coach petitions")


n = int(input())
for _ in range(n):
    line = input().split()
    name = line[0]
    start = line[1]
    birth = line[2]
    courses = int(line[3])

    is_eligble(name, start, birth, courses)