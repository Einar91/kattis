def find_n(p, q):
    tree = [(1, 1)]
    i = 0
    while tree[i] != (p, q):
        np, nq = tree[i]
        tree.append((np, (np+nq)))
        tree.append(((np+nq), nq))
        i += 1
    return i+1


datasets = int(input())
for _ in range(datasets):
    line = input().split()
    k = int(line[0])
    p, q = line[1].split("/")

    n = find_n(int(p), int(q))
    print(k, n)
