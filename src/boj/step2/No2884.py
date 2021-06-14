a, b = map(int, input().split())
if b > 44:
    b = b - 45
elif b <= 44 and a >= 1:
    a = a - 1
    b = b + 15
else:
    a = 23
    b = b + 15
print(a, b)