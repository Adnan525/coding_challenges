# max width counts characters, not words
import textwrap

def wrap(string, max_width):
    return textwrap.fill(string, max_width)

if __name__ == '__main__':
    string, max_width = "This is a a test line to test textwrap", 
    result = wrap(string, max_width)
    print(result)