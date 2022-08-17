def sum_of_num(N):
    N_str = str(N)
    sum = 0
    for c in N_str:
        sum += int(c)
    return sum

def find_p(N):
    sum = sum_of_num(N)
    p = 11
    np = sum_of_num(N*p)
    while sum_of_num(N*p) != sum:
        p += 1
    return p

N = int(input())
while N != 0:
    print(find_p(N))
    N = int(input())

