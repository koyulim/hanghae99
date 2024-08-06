# 99클럽 코테 스터디 16일차 TIL + 모음 사전

### 모음 사전

![240806](https://github.com/user-attachments/assets/f0537a09-f036-493e-8bf3-ba541f356cbb)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/277f84d0-8c17-42f1-b506-68bc941e8ccb)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/8cdbb7c1-4235-4d26-8f50-1670217135fd)

#### 문제 요지
- 알파벳 A,E,I,O,U만을 사용하여 길이 5 이하의 만들 수 있는 모든 단어중 주어진 word 단어가 몇번 째 인지 순서를 추출
- 각 자리의 문자가 사전에서 어디에 위치하는지 파악하고 이를 바탕으로 전체 위치를 계산

<br>

## 규칙 찾기

### 문자열의 종류
'A', 'E', 'I', 'O', 'U' = 5개

'A', 'E', 'I', 'O', 'U' = 0, 1, 2, 3, 4로 매핑

### 전체 단어의 개수 계산
단어의 길이별로 총 몇 개의 단어가 있는지 확인

- 길이가 1인 단어는 5개, 
- 길이가 2인 단어는 5^2 = 25개
- 길이가 3인 단어는 5^3 = 125개
- 길이가 4인 단어는 5^4 = 625개
- 길이가 5인 단어는 5^5 = 3125개

모든 길이의 단어 개수의 합 :  5 + 25 + 125 + 625 + 3125 = 3905개

### 각 자리별로 단어의 위치 계산
각 자리에서 해당 문자가 사전에서 몇 번째에 위치하는지 계산

문자간의 거리 = 경우의 수 총합 / 문자열 길이(1=5, 2=25, 3=125, 4=625, 5=3125)

- 첫 번째 자리 5^4 + 5^3 + 5^2 + 5^1 + 5^0(1) = 781 (3905 / 5)
- 두 번째 자리 5^3 + 5^2 + 5^1 + 5^0(1) = 156 (3905 / 25)
- 세 번째 자리 5^2 + 5^1 + 5^0(1) = 31 (3905 / 125)
- 네 번째 자리 5^1 + 5^0(1) = 6 (3905 / 625)
- 다섯 번째 자리 5^0(1) = 1 (3905 / 3125)

따라서, 각 자리별 값 = (3905 / 5^n번째 자리 수) * 문자열의 종류 수) + 1

<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL