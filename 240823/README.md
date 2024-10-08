# 99클럽 코테 스터디 33일차 TIL + 리코쳇 로봇 문제 풀이

### 리코쳇 로봇

리코쳇 로봇은 격자 모양의 게임판 위에서 로봇을 움직여 목표 지점에 도달하는 보드게임입니다. 로봇은 시작 위치에서 상, 하, 좌, 우 4방향 중 하나를 선택해 장애물이나 끝에 부딪힐 때까지 미끄러져 이동합니다. 이 문제는 최소한의 이동으로 목표 지점에 도달할 수 있는 방법을 찾는 것입니다.

#### 입출력 예시1

- **입력:**
  - board = ["...D..R", ".D.G...", "....D.D", "D....D.", "..D...."]
- **출력:**
  - 7

**설명:**
- R 위치에서 시작하여 아래로 이동 -> 왼쪽 -> 위쪽 -> 왼쪽 -> 아래 -> 오른쪽 -> 위쪽 순서로 이동하여 총 7번 만에 목표 지점(G)에 도달합니다.

#### 입출력 예시2

- **입력:**
  - board = ["D..R", "DD.G"]
- **출력:**
  - -1

**설명:**
- 로봇이 시작 위치에서 목표 지점(G)까지 이동할 수 없습니다. 따라서 -1을 반환합니다.

<br>

## 문제 구현 알고리즘

1. **BFS(너비 우선 탐색) 활용**:
   - BFS를 사용해 최소 이동 횟수를 탐색합니다. BFS는 최단 경로를 찾는 데 적합한 탐색 알고리즘입니다.

2. **초기 설정**:
   - 주어진 board에서 로봇의 시작 위치(R)와 목표 위치(G)를 찾습니다.
   - `visited` 리스트를 사용해 이미 방문한 위치와 방향을 기록합니다.

3. **탐색 진행**:
   - 로봇의 현재 위치에서 상, 하, 좌, 우 4방향 중 한 방향으로 이동합니다.
   - 이동은 로봇이 장애물('D')이나 격자의 끝에 부딪힐 때까지 계속됩니다.
   - 목표 지점(G)에 도달하면 현재 이동 횟수를 반환합니다.
   - 모든 경로를 탐색한 후 목표 지점에 도달하지 못하면 -1을 반환합니다.

4. **결과 반환**:
   - BFS를 사용하여 목표 지점까지 도달하는 데 필요한 최소 이동 횟수를 찾습니다.
   - 만약 목표 지점에 도달할 수 없다면 -1을 반환합니다.

### 예시 데이터의 변화

- **board = ["...D..R", ".D.G...", "....D.D", "D....D.", "..D...."]**

1. 초기 설정:
   - 로봇 시작 위치: [0,6]
   - 목표 지점: [1,2]

2. BFS 탐색 진행:
   - 첫 번째 이동: 아래로 이동 -> 위치 [3,6] (1번 이동)
   - 두 번째 이동: 왼쪽으로 이동 -> 위치 [3,3] (2번 이동)
   - 세 번째 이동: 위로 이동 -> 위치 [0,3] (3번 이동)
   - 네 번째 이동: 왼쪽으로 이동 -> 위치 [0,0] (4번 이동)
   - 다섯 번째 이동: 아래로 이동 -> 위치 [4,0] (5번 이동)
   - 여섯 번째 이동: 오른쪽으로 이동 -> 위치 [4,5] (6번 이동)
   - 일곱 번째 이동: 위로 이동 -> 위치 [1,5] -> 목표 지점에 도달 (7번 이동)

3. 최종 계산:
   - `result = 7`을 반환

<br>

## 공부 내용 정리

### BFS (너비 우선 탐색)

- BFS는 그래프나 2D 격자에서 최단 경로를 찾을 때 사용하는 탐색 알고리즘입니다.
- 큐를 이용해 시작 위치에서 인접한 모든 노드를 탐색하며 진행합니다.
- 이번 문제에서는 BFS를 활용해 최소 이동 횟수를 계산했습니다.

<br>

#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
