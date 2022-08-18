import sys, heapq

n = sys.stdin.readline()
s1, s2, s3 = [], [], []
for _ in range(int(n)):
    line = sys.stdin.readline().split()
    heapq.heappush(s1, (-int(line[1]), line[0]))
    heapq.heappush(s2, (-int(line[2]), line[0]))
    heapq.heappush(s3, (-int(line[3]), line[0]))

used = []
for _ in range(int(n) // 3):
    p1 = heapq.heappop(s1)
    while p1 in used:
        p1 = heapq.heappop(s1)
    used.append(p1)

    p2 = heapq.heappop(s2)
    while p2 in used:
        p2 = heapq.heappop(s2)
    used.append(p2)

    p3 = heapq.heappop(s3)
    while p3 in used:
        p3 = heapq.heappop(s3)
    used.append(p3)

    raid_team = [p1[1], p2[1], p3[1]]
    raid_team.sort()
    sys.stdout.write(f"{raid_team[0]} {raid_team[1]} {raid_team[2]}\n")