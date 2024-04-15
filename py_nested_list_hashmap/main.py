# getting input 
    # inputs = []
    # for _ in range(int(input())):
    #     name = input()
    #     score = float(input())
    #     inputs.append([name, score])
        
    # print(inputs)

inputs = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41.0], ['Harsh', 39.0]]

def create_dict(inputs):
    map_dict = {}
    for item in inputs:
        if item[1] not in map_dict:
            map_dict[item[1]] = [item[0]]
        else:
            map_dict[item[1]].append(item[0])
    return map_dict

# print(create_dict(inputs))

def get_result(inputs):
    target = create_dict(inputs)
    sorted_marks = sorted(target.keys())
    target_mark = sorted_marks[1]
    return sorted(target[target_mark])