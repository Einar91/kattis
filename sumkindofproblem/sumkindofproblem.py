P = int(input())
for _ in range(P):
    line = input().split()
    K = int(line[0])
    N = int(line[1])

    S1, S2, S3 = 0, 0, 0
    C1, C2, C3 = 0, 0, 0
    i = 1
    while C1 < N or C2 < N or C3 < N:
        if C1 < N:
            S1 += i
            C1 += 1
        if C2 < N and i % 2 == 0:
            S2 += i
            C2 += 1
        if C3 < N and i % 2 == 1:
            S3 += i
            C3 += 1
        i += 1

    print(f"{K} {S1} {S3} {S2}")