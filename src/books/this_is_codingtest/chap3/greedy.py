# 3-1 동전 거슬러주기 예시

n = 1260
count = 0

# 큰 단위 화페 차례대로 확인
coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += n // coin  #해당 화페로 거슬러줄 수 있는 동전의 개수 세기
    n %= coin

print(count)


#3-2 큰 수의 법칙

# N,M,K를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())
# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

data.sort() # 입력받은 수들 정렬하기
first = data[n-1] # 가장 큰 수
second = data[n-2] # 두 번째로 큰 수

# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k+1)) * k
count += m % (k+1)

result = 0
result += (count) * first # 가장 큰 수 더하기
result += (m - count) * second # 두번째로 큰 수 더하기

print(result);