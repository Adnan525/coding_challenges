import math

thick = int(input())
assert 1 == (thick % 2), "Thickness not odd."

def arrow(t, offset=0, up=True):
    w = 1
    s = []
    for l in range(t):
        s.append("H"*w)
        w += 2
    w = len(s[-1])
    s = list(map(lambda x: x.center(w), s))
    if not up: 
        s.reverse()
    for line in s:
        print(f"{' '*offset}{line}")
    return math.floor((w - t) / 2)
        
def row(t, spec):
    height = math.ceil(t * 0.51)
    s = [" "*tab,]
    for x in spec:
        s.append(f"{x}"*t)
    r = "".join(s)
    for line in range(height):
        print(r)
        
tab = arrow(thick)
row(thick, "H   H")
row(thick, "H   H")
row(thick, "HHHHH")
row(thick, "H   H")
row(thick, "H   H")
x = arrow(thick, thick * 4, False)