# height = input("Enter the height of the mat: ")
# width = input("Enter the width of the mat: ")
height = 7
width = 21

keyword = ".|."
center = int(height) // 2

def gen_keyword(n):
    return (keyword * n)

for i in range(1, 2*int(center), 2):
    print(gen_keyword(i).center(int(width), "-"))

print("WELCOME".center(int(width), "-"))

for i in range(int(center)*2-1, 0, -2):
    print(gen_keyword(i).center(int(width), "-"))
