N = int(input())
correct = input()

def check_answere(correct_answere, sequence):
    num_correct = 0
    seq_len = len(sequence)
    count = 0
    for char in correct_answere:
        if char == sequence[count]:
            num_correct += 1
        if count == seq_len-1:
            count = 0
        else:
            count += 1
    return num_correct

adrian = ["A", "B", "C"]
bruno = ["B", "A", "B", "C"]
goran = ["C", "C", "A", "A", "B", "B"]

result = {}

a = check_answere(correct, adrian)
result[a] = ["Adrian"]
b = check_answere(correct, bruno)
if b in result.keys():
    result[b].append("Bruno")
else:
    result[b] = ["Bruno"]
g = check_answere(correct, goran)
if g in result.keys():
    result[g].append("Goran")
else:
    result[g] = ["Goran"]

largest = 0
for key in result.keys():
    if key > largest:
        largest = key

names = result[largest]
names.sort()
print(largest)
for name in names:
    print(name)