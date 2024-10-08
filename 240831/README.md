# 99클럽 코테 스터디 40일차 TIL + Unique Paths
### Unique Paths

![2408311](https://github.com/user-attachments/assets/885a5993-98a4-450d-8df1-b1dc666e6647)

![2408312](https://github.com/user-attachments/assets/e9eefc31-d47a-4671-a9f0-084f1353a2c7)

번역

문제 63. Unique Paths II 

난이도: 중간 

주제: 동적 프로그래밍 등 

당신은 m x n 크기의 정수 배열 grid를 받았습니다.

로봇이 초기 위치는 왼쪽 상단 모서리(i.e., grid[0][0])에 있습니다. 

로봇은 오른쪽 하단 모서리(i.e., grid[m - 1][n - 1])로 이동하려고 합니다.

로봇은 어느 시점에서든 아래쪽 또는 오른쪽으로만 이동할 수 있습니다.

장애물(Obstacle)과 빈 공간(Space)은 각각 1 또는 0으로 표시됩니다. 

로봇이 가는 경로는 장애물이 있는 칸을 포함할 수 없습니다.

로봇이 오른쪽 하단 모서리에 도달하기 위해 갈 수 있는 가능한 고유 경로의 수를 반환하세요.

테스트 케이스는 답이 2 * 10^9 이하가 되도록 생성됩니다.

제약 사항

- m == obstacleGrid.length
- n == obstacleGrid[i].length
- 1 <= m, n <= 100
- obstacleGrid[i][j]는 0 또는 1입니다.

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/873a7a44-c5d1-4957-97e2-a8eb072db9dc)

입력: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]

출력: 2

설명: 위의 3x3 그리드에서 가운데에 장애물이 있습니다. 

오른쪽 하단 모서리에 도달하기 위해 갈 수 있는 두 가지 방법이 있습니다.

1. 오른쪽 -> 오른쪽 -> 아래 -> 아래
2. 아래 -> 아래 -> 오른쪽 -> 오른쪽

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/9a70933c-430d-4a4b-be25-7f9862dbd019)

입력: obstacleGrid = [[0,1],[0,0]]

출력: 1

<br>

#### 문제 요지
- m x n 크기의 그리드에서 로봇이 좌상단 (0, 0)에서 우하단 (m-1, n-1)까지 이동해야 함
- 로봇은 오직 오른쪽(Right)이나 아래쪽(Down)으로만 움직일 수 있음
- 그리드 내에 장애물(1로 표시)이 있을 수 있으며, 로봇은 이 장애물을 피하면서 목적지에 도달해야 함
- 이때 로봇이 도달할 수 있는 유일한 경로의 수를 계산하는 것이 목표
- 동적 계획법(Dynamic Programming, DP) 알고리즘 기법 사용

<br>


## 문제 구현 알고리즘

- 초기 상태 확인

  - 로봇의 시작 위치 (0, 0)에 장애물이 있는지 확인
  - 만약 (0, 0)에 장애물이 있다면, 로봇이 출발할 수 없으므로 0을 반환
  - 또한, 그리드가 1x1 크기이며 출발지에 장애물이 없을 경우, 유일한 경로는 1개뿐이므로 1을 반환

- 그리드 탐색 및 DP 초기화

  - 로봇의 시작 위치 (0, 0)을 1로 초기화
 
- DP 배열 업데이트

  - 그리드를 순차적으로 탐색하며, 각 셀에 도달할 수 있는 경로의 수를 업데이트
  - 첫 번째 행과 첫 번째 열은 각각 이전 셀의 값을 그대로 이어받음
  - 만약 특정 셀이 장애물(1)이면, 그 셀에서 도달할 수 있는 경로 수는 0이 됨
  - 첫 행과 첫 열 외의 나머지 셀은 왼쪽 셀과 위쪽 셀에서 올 수 있는 경로 수를 더하여 갱신

- 결과 반환

  - obstacleGrid[m-1][n-1] 값이 로봇이 목적지까지 도달할 수 있는 경로의 수

### 예시 데이터의 변화
- 입력 예시 : obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]

      1 0 0
      0 0 0
      0 0 0

      1 1 1
      0 0 0
      0 0 0

      1 1 1
      1 0 0
      1 0 0

      1 1 1
      1 0 1
      1 1 2

- 최종적으로 우하단 값은 2이므로, 반환 값은 2

<br>

#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
