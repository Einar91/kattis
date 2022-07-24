lines = 10
div = 42

unique = set()
for _ in range(lines):
    num = int(input())
    remainder = num % div
    unique.add(remainder)

print(len(unique))