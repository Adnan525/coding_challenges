if __name__ == '__main__':
    s = "qwertyuiopasdfghjklzxcvbnm"
    target = {}
    # if len(uniques) is 3 we can just return the uniques with occurences, did not implement this
    uniques = set(s)
    for c in uniques:
        target[c] = s.count(c)
    
    sorted_target = dict(sorted(target.items(), key = lambda item : item[0], reverse=False))
    print(sorted_target)
    sorted_target = dict(sorted(sorted_target.items(), key = lambda item : item[1], reverse=True))
    print(sorted_target)

    for i, item  in enumerate(sorted_target):
       if(i == 3):
           break
       print(f"{item} {sorted_target[item]}")