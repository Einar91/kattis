RCZZ = input().split()
R = int(RCZZ[0])
C = int(RCZZ[1])
ZR = int(RCZZ[2])
ZC = int(RCZZ[3])

matrix = []
for _ in range(R):
    row = input()
    new_row = ""
    for c in row:
        new_row += (c * ZC)
    matrix.append(new_row)

if ZR > 1:
    new_matrix = []
    for i in range(R):
        for j in range(ZR):
            new_matrix.append(matrix[i])
    matrix = new_matrix

for line in matrix:
    print(line)
