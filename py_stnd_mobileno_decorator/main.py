def wrapper(f):
    def fun(l):
        formatted_numbers = []
        for num in l:
            num_str = str(num)
            if len(num_str) == 10:
                # need to add +91 to the number
                formatted_numbers.append(f"+91 {num_str[:5]} {num_str[5:]}")
            elif len(num_str) == 11:
                # has 0 at the beginning
                # need to remove 0
                # need to add +91 to the number
                formatted_numbers.append(f"+91 {num_str[1:6]} {num_str[6:]}")
            elif len(num_str) == 12:
                # just add + and space
                formatted_numbers.append(f"+91 {num_str[2:7]} {num_str[7:]}")
            elif len(num_str) == 13:
                formatted_numbers.append(f"{num_str[:3]} {num_str[3:8]} {num_str[8:]}")
                
        return f(formatted_numbers)
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = ['07895462130', '919875641230', '9195969878']  # Phone numbers should be strings
    sort_phone(l)
