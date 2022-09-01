def or_case(i, j):
    if i == 1 or j == 1:
        return 1
    elif i == '?' or j == '?':
        return '?'
    else:
        return 0

def and_case(i, j):
    if i == 1 and j == 1:
        return 1
    elif i == 0 or j == 0:
        return 0
    else:
        return '?'

def solution():
    n = int(input())
    while n != 0:
        register = ['?'] * 32

        for _ in range(n):
            cmd = input().split()
            if cmd[0] == 'SET':
                register[int(cmd[1])] = 1
            elif cmd[0] == 'CLEAR':
                register[int(cmd[1])] = 0
            elif cmd[0] == 'OR':
                i = int(cmd[1])
                j = int(cmd[2])
                register[i] = or_case(register[i], register[j])
            elif cmd[0] == 'AND':
                i = int(cmd[1])
                j = int(cmd[2])
                register[i] = and_case(register[i], register[j])                

        register.reverse()
        print(''.join([str(x) for x in register]))
        n = int(input())

def main():
    solution()

main()