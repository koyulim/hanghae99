# 99클럽 코테 스터디 30일차 TIL + Find Right Interval

### Find Right Interval

![240820](https://github.com/user-attachments/assets/dbdc3a58-7b19-4d9b-af9c-606f986c5b0d)

![2408201](https://github.com/user-attachments/assets/f79695ad-0ad5-4a72-a5b2-9a56cf36f5f9)

"오른쪽 간격 찾기"

당신에게 여러 개의 간격(interval)로 이루어진 배열이 주어졌습니다. 

각 간격 intervals[i]는 [starti, endi] 형식이며, 각 starti는 고유한 값입니다.

각 간격 i에 대해, "오른쪽 간격(right interval)"이란 간격 j를 말하며, 이때 startj >= endi이고, startj는 최소화됩니다. 

즉, j는 가장 작은 시작값을 가지면서도 endi보다 크거나 같은 시작값을 가진 간격입니다. 

i와 j가 같을 수도 있습니다.

각 간격 i에 대해 오른쪽 간격의 인덱스가 들어있는 배열을 반환하세요. 

만약 간격 i에 대해 오른쪽 간격이 존재하지 않으면, 해당 인덱스에는 -1을 넣으세요.

제약조건:

- intervals.length는 1 이상 20,000 이하입니다.
- intervals[i].length는 2입니다.
- -10^6 <= starti <= endi <= 10^6입니다.
- 각 간격의 시작점(start)은 고유합니다.

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/c2801887-dbb7-4ccf-a06b-238915717865)

- 입력: intervals = [[1,2]]
- 출력: [-1]
- 설명: 이 집합에는 하나의 간격만 존재하므로, -1을 출력합니다.

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/5ee8115a-52d1-4cb9-9c3d-b1ffd1936e46)

- 입력: intervals = [[3,4],[2,3],[1,2]]
- 출력: [-1,0,1]
- 설명:

    - [3,4]에 대한 오른쪽 간격은 없습니다.
    - [2,3]의 오른쪽 간격은 [3,4]이며, start0 = 3이 end1 = 3보다 크거나 같은 가장 작은 시작값입니다.
    - [1,2]의 오른쪽 간격은 [2,3]이며, start1 = 2가 end2 = 2보다 크거나 같은 가장 작은 시작값입니다.

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/64db05f0-6a18-47ae-815f-f3ec3f290d3c)

- 입력: intervals = [[1,4],[2,3],[3,4]]
- 출력: [-1,2,-1]
- 설명:
    - [1,4]와 [3,4]에 대한 오른쪽 간격은 없습니다.
    - [2,3]의 오른쪽 간격은 [3,4]이며, start2 = 3이 end1 = 3보다 크거나 같은 가장 작은 시작값입니다.

<br>

#### 문제 요지
- 주어진 간격 배열에서 각 간격에 대해 "right interval"을 찾는 문제
- 현재 간격의 끝점 endi보다 크거나 같은 시작점을 가진 간격 중에서 가장 작은 시작점을 가진 간격
- 만약 그런 간격이 없으면 -1을 반환
- 이분 탐색 알고리즘 기법 사용


<br>

## 문제 구현 알고리즘
- 각 간격의 시작점을 키로, 인덱스를 값으로 하는 해시맵 생성
- 시작점을 오름차순으로 정렬 후 리스트로 저장
- 각 간격에 대한 이분 탐색

    - left와 right를 설정한 후, while문을 통해 mid를 계산하여 이분 탐색을 진행
    - list[mid]가 target보다 작으면, left를 mid + 1로 이동
    - list[mid]가 target보다 크거나 같으면, right를 mid로 이동 및 value 반환
    - 값이 없으면 -1 반환

- 각 간격에 대해 찾은 인덱스 값을 배열로 반환

### 예시 데이터의 변화
- intervals = [[3,4],[2,3],[1,2]]

1. map = {3: 0, 2: 1, 1: 2}
2. keyList = [1, 2, 3]
3. 간격 [3,4] 처리

    - target = 4, left = 0, right = 3
    - mid = 1 (keyList[1] = 2), left를 2로 이동
    - mid = 2 (keyList[2] = 3), left를 3으로 이동
    - 종료 후 index = -1 (해당하는 간격이 없음)
    - 결과: answer[0] = -1

4. 간격 [2,3] 처리

    - target = 3, left = 0, right = 3
    - mid = 1 (keyList[1] = 2), left를 2로 이동
    - mid = 2 (keyList[2] = 3), right를 2로 이동하고 index = 0
    - 결과: answer[1] = 0

5. 간격 [1,2] 처리

    - target = 2, left = 0, right = 3
    - mid = 1 (keyList[1] = 2), right를 1로 이동하고 index = 1
    - 결과: answer[2] = 1
    
6. 최종 결과 : answer = [-1, 0, 1]

<br>

## 공부 내용 정리
### 이분 탐색
- 오름차순 또는 내림차순으로 정렬된 배열에 적용 가능한 탐색 기법
- 정렬된 배열에서 특정 값을 찾을 때 정중앙에 위치한 값을 활용

참고 자료 : https://charles098.tistory.com/133




<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
