# a = int(input())
# for i in range(a):
#     x,y = map(int, input().split())
#     z = x + y
#     print("Case #%s: %s + %s = %s"%(i+1, x, y, z))

a = int(input())
for i in range(a):
    x,y = map(int, input().split())
    z = x + y
    print("Case #{i}: {x} + {y} = {z}".format(i=i+1, x=x, y=y, z=z))

# i=0
# x=2
# y=3
# print('Case #{i}: {x} + {y} = {z}'.format(i=i+1, x=x, y=y, z=x+y)) 