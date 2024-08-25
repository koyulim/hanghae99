---

# 99클럽 코테 스터디 32일차 TIL + 무인도 여행

### 무인도 여행

메리는 무인도로 여행을 가기 위해 지도를 분석하고 있습니다. 지도는 직사각형 격자로 되어 있으며, 'X'는 바다를, 숫자는 무인도를 나타냅니다. 각 숫자는 해당 칸의 식량을 의미하며, 상하좌우로 연결된 숫자들의 합은 해당 무인도에서 머무를 수 있는 최대 일수를 나타냅니다. 메리는 무인도에서 최대 며칠 머무를 수 있는지 알고 싶어 합니다.

#### 입출력 예시1

- **입력:**
  - maps = ["X591X", "X1X5X", "X231X", "1XXX1"]
- **출력:**
  - [1, 1, 27]

**설명:**
- 첫 번째 섬: 1 (위치: [1,1])
- 두 번째 섬: 1 (위치: [2,3])
- 세 번째 섬: 27 (위치: [2,2] -> [2,3] -> [3,2] -> [3,3] -> [4,2])

#### 입출력 예시2

- **입력:**
  - maps = ["XXX", "XXX", "XXX"]
- **출력:**
  - [-1]

**설명:**
- 지도 전체가 바다로만 이루어져 있어 머무를 수 있는 무인도가 없습니다.

<br>

## 문제 구현 알고리즘

1. **DFS(깊이 우선 탐색) 활용**:
   - DFS를 사용하여 지도에서 무인도를 탐색합니다. 하나의 무인도에 포함된 모든 숫자들을 합산하여 해당 무인도에서 머무를 수 있는 최대 일수를 계산합니다.

2. **방문 기록**:
   - `visited` 리스트를 사용해 이미 방문한 좌표를 기록합니다. 방문한 좌표는 다시 방문하지 않도록 하여 중복 계산을 방지합니다.

3. **탐색 및 계산**:
   - 지도 전체를 순회하며 'X'가 아닌 칸을 만나면 DFS를 시작합니다. DFS를 통해 해당 칸이 속한 무인도 전체를 탐색하고, 무인도의 총 식량을 계산합니다.
   - 무인도마다 계산된 식량을 리스트에 저장합니다.

4. **결과 반환**:
   - 모든 무인도를 탐색한 후, 각 무인도에서 머무를 수 있는 최대 일수를 오름차순으로 정렬하여 반환합니다.
   - 만약 무인도가 없으면 [-1]을 반환합니다.

### 예시 데이터의 변화

- **maps = ["X591X", "X1X5X", "X231X", "1XXX1"]**

1. 초기 설정:
   - `visited = [[False, False, False, False, False], [False, False, False, False, False], [False, False, False, False, False], [False, False, False, False, False]]`

2. 탐색 시작:
   - 첫 번째 무인도: 시작 위치 [0,1] -> [0,2] -> 합산 = 1
   - 두 번째 무인도: 시작 위치 [1,1] -> [2,0] -> 합산 = 1
   - 세 번째 무인도: 시작 위치 [2,1] -> [2,2] -> [2,3] -> [3,1] -> 합산 = 27

3. 최종 계산:
   - `result = [1, 1, 27]`을 반환

<br>

## 공부 내용 정리

### DFS (깊이 우선 탐색)

- DFS는 그래프나 2D 격자에서 모든 경로를 탐색할 때 사용하는 알고리즘입니다.
- 스택이나 재귀를 이용해 현재 노드(칸)에서 가능한 모든 경로를 따라가며 탐색을 수행합니다.
- 이번 문제에서는 DFS를 활용하여 하나의 무인도에 속하는 모든 칸을 탐색하고, 해당 무인도에서 머무를 수 있는 최대 일수를 계산했습니다.

<br>

#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL