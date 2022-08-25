N, K = input().split()
seq = list(input().split())

dict = {}
for i in range(1, int(K)+1):
    dict[i] = 0

for e in seq:
    dict[int(e)] += 1

low = 1000
for k,v in dict.items():
    if v < low:
        low = v

colors = []
for k,v in dict.items():
    if v == low:
        colors.append(k)

colors.sort()
print(str(len(colors)))
for c in colors:
    print(c, end=' ')