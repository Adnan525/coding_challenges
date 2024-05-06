from itertools import product
# result = list(product([1,2,3], repeat = 2))
result = list(product([1,2,3],[3,4]))
print(result)
A = [[1,2,3],[3,4,5]]
print(list(product(*A)))