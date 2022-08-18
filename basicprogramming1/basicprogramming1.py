import string

Nt = input().split()
N = int(Nt[0])
t = int(Nt[1])

A = input().split()
A = [int(x) for x in A]

if t == 1:
    print(7)
elif t == 2:
    if A[0] > A[1]:
        print("Bigger")
    elif A[0] == A[1]:
        print("Equal")
    else:
        print("Smaller")
elif t == 3:
    new_list = A[:3]
    new_list.sort()
    print(new_list[1])
elif t == 4:
    sum = 0
    for i in A:
        sum += i
    print(sum)
elif t == 5:
    sum = 0
    for i in A:
        if i % 2 == 0:
            sum += i
    print(sum)
elif t == 6:
    mod26 = map(lambda x: x % 26, A)
    alpha = map(lambda x: chr(ord('a') + x), mod26)
    print(''.join(alpha))
elif t == 7:
    i = 0
    while True:
        index = A[i]
        A[i] = -1
        if index >= N:
            print("Out")
            break;
        if index == N-1:
            print("Done")
            break;
        if index == -1:
            print("Cyclic")
            break;
        i = index

