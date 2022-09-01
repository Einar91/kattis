line = input().split()
h = int(line[0])
path = ''
if len(line) > 1:
    path = line[1]

maxnodes = 2**(h+1) - 1
i = 0
for p in path:
    if p == 'L':
        i = 2*i + 1
    else:
        i = 2*i + 2
print(str(maxnodes-i))