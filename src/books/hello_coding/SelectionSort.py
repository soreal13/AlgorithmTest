
def findSmallist(arr):
    smallest = arr[0] # 가장 작은 정수 지정
    smallest_index = 0 # 가장 작은 정수의 인덱스를 지정
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr): #배열을 정렬
    newArr = []
    for ii in range(len(arr)):
        smallest = findSmallist(arr)
        newArr.append(arr.pop(smallest))
    return newArr

print(selectionSort([5, 3, 6, 2, 10]))