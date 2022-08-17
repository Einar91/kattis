ABC = input().split()
left = int(ABC[0])
mid = int(ABC[1])
right = int(ABC[2])

count = 0
while left < right - 2:
    left_gap = mid - left
    right_gap = right - mid
    if left_gap > right_gap and left_gap > 1:
        tmp = mid
        mid = left+1
        right = tmp
        count += 1
    elif right_gap > 1:
        tmp = mid
        mid = right-1
        left = tmp
        count += 1

print(count)


