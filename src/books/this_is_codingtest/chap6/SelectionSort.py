# 선택 정렬
# 매번 가장 작은 수 찾기 위해 비교 연산 필요
# 연산 횟수 : N + (N-1) + (N-2) + ... + 2 = O(N^2)
# 정렬 데이터 100개 늘어나면 수행시간 10,000배 늘어남
array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
    min_index = i # 가장 작은 원소의 인덱스
    for j in range(i + 1, len(array)):
        if array[min_index] > array[j]:
            min_index = j
    array[i], array[min_index] = array[min_index], array[i] #스와프

print(array)

# 0 인덱스와 1 인덱스의 원소 교체
array2 = [3, 5]
array2[0], array2[1] = array2[1], array2[0]

print(array2)