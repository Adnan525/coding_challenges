"""
--------e--------
------e-d-e------
----e-d-c-d-e----
--e-d-c-b-c-d-e--    
e-d-c-b-a-b-c-d-e   reverse + original
--e-d-c-b-c-d-e--
----e-d-c-d-e----
------e-d-e------
--------e--------
"""

import string
def print_rangoli(size):
    alpha = string.ascii_lowercase # get all lowercase letters (a-z)
    n = size
    L = []
    for i in range(n):
        s = "-".join(alpha[i:n])
        L.append((s[::-1] + s[1:]).center(4*n-3, "-")) # reverse then add the original string
    print('\n'.join(L[::-1] + L[1:]))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)