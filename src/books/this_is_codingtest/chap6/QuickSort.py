# 퀵 정렬
# 기준 설정 후 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식
# 피벗 : 큰 숫자와 작은 숫자를 교환할 때 교환하기 위한 '기준'
# 재귀 함수와 동작 원리가 같음. 종료 조건은 현재 리스트의 데이터 개수가 1 일때.

array = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]

# 널리 사용되는 가장 직관적인 형태의 퀵 정렬 소스 코드
def quick_sort(array, start, end):
    if start >= end: # 원소가 1개일 경우 종료
        return
    pivot = start # 피벗은 첫 번째 원소
    left = start + 1
    right = end
    while left <= right:
        # 피벗보다 큰 데이터 찾을 때까지 반복
        while left <= end and array[left] <= array[pivot]:
            left += 1
        # 피벗보다 작은 데이터를 찾을 때까지 반복
        while right > start and array[right] >= array[pivot]:
            right -= 1
        if left > right : # 엇갈렸다면 작은 데이터와 피벗을 교체
            array[right], array[pivot] = array[pivot], array[right]
        else: # 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
            array[left], array[right] = array[right], array[left]
    # 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
    quick_sort(array, start, right - 1)
    quick_sort(array, right + 1, end)

quick_sort(array, 0, len(array)-1)
print(array)

# 파이썬 장점 살린 짧은 퀵 정렬 소스코드
def quick_sort_python(array):
    # 리스트가 하나 이하의 원소만을 담고 있다면 종료
    if len(array) <= 1:
        return array

    pivot = array[0] # 피벗은 첫 번째 원소
    tail = array[1:] # 피벗을 제외한 리스트

    left_side = [x for x in tail if x <= pivot] # 분할된 왼쪽 부분
    right_side = [x for x in tail if x > pivot] # 분할된 오른쪽 부분

    # 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행하고 전체 리스트 반환
    return quick_sort_python(left_side) + [pivot] + quick_sort_python(right_side)

print(quick_sort_python(array))