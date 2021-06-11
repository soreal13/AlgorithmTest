a = input()
num1 = int(a)
b = input()
num2 = str(b)

# a = 362
# num1 = int(a)
# b = 215
# num2 = str(b)

for i in range(len(num2), 0, -1):
    print(num1 * int(num2[i-1])) # num2 뒤 인덱스부터 곱해야 하므로

num3 = int(num2)
print(num1 * num3)