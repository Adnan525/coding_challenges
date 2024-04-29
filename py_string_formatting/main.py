"""
Given an integer n, print the following values for each integer from 1 to n:
Decimal
Octal
Hexadecimal (capitalized)
Binary
"""

def print_formatted(number):
    width = len(bin(number)[2:]) # 0b1010101010101010101010, remove 0b
    for i in range(1, number+1):
        print(f"{i:{width}d} {i:{width}o} {i:{width}X} {i:{width}b}")

if __name__ == "__main__":
    n = int(input())
    print_formatted(n)
    # print("{:10d}".format(15))