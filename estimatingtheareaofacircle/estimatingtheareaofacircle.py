import math, sys

for i in sys.stdin:
    if (i == "0 0 0\n"):
        continue
        
    rmc = i.split()
    r = float(rmc[0])
    m = int(rmc[1])
    c = int(rmc[2])

    area = math.pi * (r ** 2)
    square_area = (r*2) * (r*2)
    experiment_estimate = c / m
    relativ = square_area * experiment_estimate

    print(area, relativ)