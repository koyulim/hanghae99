# 99클럽 코테 스터디 31일차 TIL + 점프 점프

### 점프 점프

영우는 n개의 돌이 일렬로 놓여있는 돌다리에서 개구리처럼 점프를 하며 놀고 있습니다. 각 돌에는 특정한 숫자가 적혀있으며, 이 숫자만큼 왼쪽이나 오른쪽으로 점프할 수 있습니다. 현재 영우가 있는 돌에서 시작하여, 방문 가능한 돌들의 개수를 구하는 것이 이번 문제의 목표입니다.

#### 입출력 예시1

- **입력:**
  - n = 7
  - jumps = [1, 2, 1, 2, 1, 2, 1]
  - start = 4
- **출력:**
  - 7

**설명:**
4번 돌에서 시작해서 점프하면, 모든 돌을 방문할 수 있습니다. 따라서 방문 가능한 돌의 총 개수는 7개입니다.

#### 입출력 예시2

- **입력:**
  - n = 5
  - jumps = [1, 1, 1, 1, 1]
  - start = 3
- **출력:**
  - 5

**설명:**
3번 돌에서 시작해도, 모든 돌을 방문할 수 있습니다. 이 경우에도 방문 가능한 돌의 총 개수는 5개입니다.

<br>

## 문제 구현 알고리즘

1. **BFS (너비 우선 탐색) 활용**:

   - BFS를 통해 시작점에서 출발하여 모든 가능한 이동 경로를 탐색합니다.
   - 큐를 사용하여 현재 위치에서 점프 가능한 다음 위치들을 탐색합니다.

2. **방문 기록**:

   - `visited` 리스트를 사용해 방문한 돌들을 기록합니다. 한 번 방문한 돌은 다시 방문하지 않도록 하여 불필요한 연산을 줄입니다.

3. **큐를 이용한 탐색**:

   - 시작점을 큐에 넣고, 큐가 빌 때까지 현재 위치에서 점프 가능한 다음 위치들을 확인합니다. 각 점프 위치가 돌다리 범위 내에 있고, 아직 방문하지 않았다면 큐에 추가합니다.

4. **최종 결과 반환**:
   - BFS를 통해 큐를 모두 탐색한 후, 방문 가능한 돌들의 개수를 반환합니다.

### 예시 데이터의 변화

- **n = 7**, **jumps = [1, 2, 1, 2, 1, 2, 1]**, **start = 4**

1. 초기 설정:

   - `visited = [False, False, False, True, False, False, False]` (4번 돌에서 시작)
   - `queue = [3]` (0-indexed, 3번 돌부터 시작)

2. 4번 돌에서 시작해 좌우로 점프:

   - 좌측 점프: `current = 3, left = 1`
   - 우측 점프: `current = 3, right = 5`
   - `visited = [False, True, False, True, False, True, False]`
   - `queue = [1, 5]`

3. 큐에서 1번 돌을 꺼내 점프:

   - 좌측 점프: `current = 1, left = 0`
   - 우측 점프: `current = 1, right = 3` (이미 방문)
   - `visited = [True, True, False, True, False, True, False]`
   - `queue = [5, 0]`

4. 큐에서 5번 돌을 꺼내 점프:

   - 좌측 점프: `current = 5, left = 3` (이미 방문)
   - 우측 점프: `current = 5, right = 7`
   - `visited = [True, True, False, True, False, True, True]`
   - `queue = [0, 6]`

5. 큐에서 0번 돌을 꺼내 점프:

   - 좌측 점프: 돌다리 밖이므로 무시
   - 우측 점프: `current = 0, right = 1` (이미 방문)
   - `visited = [True, True, False, True, False, True, True]`
   - `queue = [6]`

6. 큐에서 6번 돌을 꺼내 점프:
   - 좌측 점프: `current = 6, left = 5` (이미 방문)
   - 우측 점프: 돌다리 밖이므로 무시
   - `visited = [True, True, True, True, True, True, True]`
   - `queue = []` (큐가 비어 탐색 종료)

최종적으로, `visited` 리스트에서 `True`의 개수는 7이므로, 방문 가능한 돌들의 개수는 7개입니다.

<br>

## 공부 내용 정리

### BFS (너비 우선 탐색)

- BFS는 그래프에서 모든 노드를 탐색할 때 사용하는 알고리즘입니다.
- 시작점에서 시작해 인접한 모든 노드를 탐색하며, 주로 큐 자료구조를 사용합니다.
- BFS를 활용하면 특정 시작점에서 도달 가능한 모든 위치를 효과적으로 탐색할 수 있습니다.

<br>

#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL