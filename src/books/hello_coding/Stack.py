def greet(name):
    print("hello ", + name + "!")
    greet2(name)
    print("getting ready to say bye..")
    bye()

def greet2(name):
    print("how ar you, " + name + "?")


def bye():
    print("ok bye!")


# 재귀 함수에서 호출 스택 사용
def fact(x):
    if  x == 1:
        return 1
    else:
        return x * fact(x-1)

