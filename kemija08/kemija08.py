vowels = ("a", "e", "i", "o", "u")
code_letter = "p"

def decode(sentence):
    real_sentence = ""
    index = 0
    while index < len(sentence):
        real_sentence += sentence[index]
        if sentence[index] in vowels and index < len(sentence)-2:
            if sentence[index+1] == code_letter and sentence[index+2] == sentence[index]:
                index = index+2
        index += 1
    return real_sentence

print(decode(input()))