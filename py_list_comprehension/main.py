def generate_array(args):
    target = []
    for arg in args:
        target.append([i for i in range(arg+1)])
    return target


def generate_combinations(arrays):
    if len(arrays) == 1:
        return [[x] for x in arrays[0]]
    else:
        sub_combinations = generate_combinations(arrays[1:])
        result = []
        for item in arrays[0]:
            for sub_combination in sub_combinations:
                result.append([item] + sub_combination)
        return result

def list_comprehension_limit(x, y, z, n):
    generated_array = generate_array([x, y, z])
    combinations = generate_combinations(generated_array)
    return [combination for combination in combinations if sum(combination) != n]

print(list_comprehension_limit(1, 1, 1, 2))