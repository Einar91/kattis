num_lines = int(input())

for _ in range(num_lines):
    line = input()
    tokens = line.split()
    if tokens[0] == "Simon" and tokens[1] == "says":
        print(line[11::])