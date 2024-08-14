# 99클럽 코테 스터디 24일차 TIL + 대충 만든 자판

### 대충 만든 자판

![240814](https://github.com/user-attachments/assets/3abbc566-4430-46b7-9bcd-e76811e8c197)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/058c7dc8-9255-44f6-88c0-6e59a67948cf)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/631f6868-7678-403e-9a5c-eba59f105c96)

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/6f86ae40-96c2-4c75-a3ad-06cfc82721b3)


#### 문제 요지
- keymap에 할당 되어져 있는 배열의 리스트 문자열의 각 자리수를 추출
- targets에 할당 되어져 있는 배열의 리스트 문자열의 각 자리수가 위에서 추출한 값들을 합산 하였을 때 가장 짧은 횟수

#### 알고리즘
- keymap에 할당 되어져 있는 배열의 리스트 문자열의 각 자리수를 map에 저장
- 저장할 때 key 값이 없으면 저장, 있으면 value 값이 더 작은 값을 저장
- targets에 할당 되어져 있는 배열의 리스트 문자열의 각 값을 map의 key 값과 대조
- map에 값이 있는 경우에는 계속 덧셈, 없는 경우에는 -1 리턴 


<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
