# 99클럽 코테 스터디 41일차 TIL + First Day Where You Have Been in All the Rooms
### First Day Where You Have Been in All the Rooms

![240901](https://github.com/user-attachments/assets/40329994-0748-4d9c-af70-854278809e9a)

![2409022](https://github.com/user-attachments/assets/2e4de00d-91ed-4863-9c0b-bd5c1a4364e9)

번역

모든 방을 방문한 첫 번째 날 당신은 0부터 n-1까지 번호가 매겨진 n개의 방을 방문해야 합니다.

각 날은 0부터 시작하여 순서대로 번호가 매겨집니다.

매일 하나의 방을 방문하게 됩니다.

첫 번째 날인 0일에 방 0을 방문합니다. 

이후 방문할 방의 순서는 다음 규칙과 주어진 0-인덱스 배열 nextVisit에 의해 결정됩니다. 

nextVisit 배열의 길이는 n입니다.

어느 날 방 i를 방문했다고 가정합니다.

방 i를 방문한 총 횟수가 홀수(이번 방문 포함)인 경우, 다음 날에는 nextVisit[i]에 지정된 값의 방을 방문합니다. 

이때, 0 <= nextVisit[i] <= i가 성립합니다.

방 i를 방문한 총 횟수가 짝수(이번 방문 포함)인 경우, 다음 날에는 (i + 1) mod n 방을 방문합니다.

모든 방을 방문한 첫 번째 날의 번호를 반환하세요.

답은 매우 클 수 있으므로 결과를 10^9 + 7로 나눈 나머지를 반환해야 합니다.

제한사항
- n == nextVisit.length
- 2 <= n <= 105
- 0 <= nextVisit[i] <= i

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/f3d500a7-4c21-4dd1-b0e3-81221f04625b)

입력 : nextVisit = [0,0]

출력 : 2

설명

- 0일에 방 0을 방문합니다. 
- 방 0을 방문한 총 횟수는 1로 홀수입니다. 
- 다음 날에는 nextVisit[0] = 0 방을 방문합니다.
- 1일에 방 0을 방문합니다. 
- 방 0을 방문한 총 횟수는 2로 짝수입니다. 
- 다음 날에는 (0 + 1) mod 2 = 1 방을 방문합니다.
- 2일에 방 1을 방문합니다. 
- 이 날이 모든 방을 방문한 첫 번째 날입니다.

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/e2318cbc-a04e-4b8f-8126-cb8aa01c0c4e)

입력 : nextVisit = [0,0,2]

출력 : 6

설명

- 각 날에 방문한 방의 순서는 [0,0,1,0,0,1,2,...]입니다.
- 6일이 모든 방을 처음으로 방문한 날입니다.

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/da09e5f0-3fee-474f-8b53-16f4f6394c03)

입력 : nextVisit = [0,1,2,0]

출력 : 6

설명
- 각 날에 방문한 방의 순서는 [0,0,1,1,2,2,3,...]입니다.
- 6일이 모든 방을 처음으로 방문한 날입니다.


<br>

#### 문제 요지
- 여러 개의 방이 있고, 각 방을 방문하는 규칙이 주어진 상황에서 모든 방을 방문하는 첫 번째 날을 계산하는 문제
- 초기에는 첫 번째 방(방 0)에서 시작하며, 이후 각 방을 방문하는 규칙에 따라 다음 날 방문할 방이 결정됨
- 방문 규칙

  - 현재 방문 중인 방 i를 방문한 횟수가 홀수이면, 주어진 nextVisit[i]에 따라 이전 또는 동일한 방을 방문
  - 방문 중인 방 i를 방문한 횟수가 짝수이면, 다음 방 (i + 1) mod n을 방문
  - 모든 방을 최소 한 번 방문하는 첫 번째 날을 계산하여 반환해야 하며, 결과는 10^9 + 7로 나누어 반환

- 동적 계획법(Dynamic Programming, DP) 알고리즘 기법 사용

<br>


## 문제 구현 알고리즘
- DP 배열 초기화
 
  - DP 배열 dp는 각 방을 처음 방문하는 날을 저장
  - modulo는 큰 수 계산을 위해 10^9 + 7로 설정
 
- DP 배열 업데이트

  - 1번 방부터 n-1번 방까지의 값을 계산하여 dp 배열에 저장
  - dp[i]는 이전 방까지의 누적 방문 날짜, 그 방에서 두 번 방문하는 시간, 그리고 현재 방으로 다시 돌아오기 위한 시간을 더한 값으로 계산
 
- 결과 반환

  - 마지막 방을 방문한 날인 dp[nextVisit.length - 1]을 반환


### 예시 데이터의 변화
- 입력: nextVisit = [0, 0, 2]
- DP 배열의 초기 상태: [0, 0, 0]
- 첫 번째 반복 (i = 1)

  - dp[1] = (dp[0] + 2 + dp[0] - dp[nextVisit[0]] + modulo) % modulo
  - dp[1] = (0 + 2 + 0 - 0 + 1000000007) % 1000000007 = 2  
  - DP 배열 업데이트: [0, 2, 0]

- 두 번째 반복 (i = 2)

  - dp[2] = (dp[1] + 2 + dp[1] - dp[nextVisit[1]] + modulo) % modulo
  - dp[2] = (2 + 2 + 2 - 2 + 1000000007) % 1000000007 = 6
  - DP 배열 업데이트: [0, 2, 6]

- 최종 결과: dp[2] = 6

<br>

#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
