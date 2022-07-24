print(1)
current_num = int(input())
while current_num < 99:
    if current_num == 97 or current_num == 98:
        print(99)
        break
    elif current_num == 2:
        print(current_num+1)
    elif current_num == 3:
        print(current_num+2)
    else:
        print(current_num+1)

    current_num = int(input())