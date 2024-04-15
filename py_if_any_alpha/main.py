if __name__ == '__main__':
    s = input()
    funcs = [str.isalnum, str.isalpha, str.isdigit, str.islower, str.isupper]
    for func in funcs:
        print(any(func(c) for c in s))
