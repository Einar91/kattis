from re import I


datasets = int(input())
for _ in range(datasets):
    line = input().split()
    k = int(line[0])
    p, q = line[1].split("/")
    p = int(p)
    q = int(q)

    path = ""
    while p > 1 or q > 1:
        if (q > p):
            q = q-p
            path += "L"
        else:
            p = p-q
            path += "R"

    rev_path = list(path)
    rev_path.reverse()
    i = 1
    print(rev_path)
    for e in rev_path:
        i = 2*i
        if e == "R":
            i += 1
    print(k, i)
