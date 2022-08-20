high = 11
low = 0
guess = int(input())
while guess != 0:
    reply = input().strip()

    if reply == "too high" and high == 11:
        high = guess
    elif reply == "too low" and low == 0:
        low = guess
    
    elif reply == "right on":
        if guess > low and guess < high:
            print("Stan may be honest")
        else:
            print("Stan is dishonest")
        low, high = 0, 11
            
    elif reply == "too high" and guess < high:
        high = guess
    elif reply == "too low" and guess > low:
        low = guess

    guess = int(input())