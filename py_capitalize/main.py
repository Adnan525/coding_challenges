import math
import os
import random
import re
import sys


def solve(s):
    temp = s
    word_pattern = r"\b\w+\b"
    words = re.findall(word_pattern, s)
    for word in words:
        temp = temp.replace(word, word.capitalize())
    # print(" ".join([word.capitalize() for word in words]))
    print(temp)
    # return [word.capitalize() for word in words]
    return temp

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = "q w e r t y u i o p a s d f g h j  k l z x c v b n m Q W E R T Y U I O P A S D F G H J  K L Z X C V B N M"

    result = solve(s)
    # print(result)

    # fptr.write(result + '\n')

    # fptr.close()
