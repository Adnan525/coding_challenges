import math
import os
import random
import re
import sys


def solve(s):
    word_pattern = r"\b[a-z]+\b"
    words = re.findall(word_pattern, s)
    print(" ".join([word.capitalize() for word in words]))
    return [word.capitalize() for word in words]

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = "muntasir adnan"

    result = solve(s)
    print(result)

    # fptr.write(result + '\n')

    # fptr.close()
