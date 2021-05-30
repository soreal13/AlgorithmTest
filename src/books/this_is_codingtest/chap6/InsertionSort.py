# 삽입 정렬
# 데이터 하나씩 확읺며 각 데이터 적절한 위치에 삽입
# 정렬이 이루어진 원소는 항상 오름차순을 유지하고 있다
# 시간 복잡도 O(N^2)

array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(1, len(array)):
    for j in range(i, 0, -1): # 인덱스 i부터 1까지 감소하며 반복하는 문법
        if array[j] < array[j - 1]: # 한 칸씩 왼쪽으로 이동
            array[j], array[j - 1] = array[j - 1], array[j]
        else: # 자기보다 작은 데이터 만나면 그 위치에서 멈춤
            break

print(array)