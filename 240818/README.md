# 99클럽 코테 스터디 28일차 TIL + 괄호 회전하기

### 괄호 회전하기

![240818](https://github.com/user-attachments/assets/74d88fac-b7f6-4fa6-84e3-9e315f9bfeb3)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/3c317783-b1b0-43be-90df-59181d3d16fc)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/44be684a-b0ec-4bdd-b0b1-450aa48e5e76)

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/ed761016-8e19-4bd4-bdbd-74bd6d30db01)

#### 입출력 예시4

![ex4](https://github.com/user-attachments/assets/97feed9c-39a7-4d3d-a375-a7e311296f51)


#### 문제 요지
- substring을 이용하여 주어진 문자열을 주어진 문자열의 길이만큼 회전 시키면서 올바른 괄호인지 체크
- 회전하면서 반복문을 통해 스택에 값을 1개씩 삽입 및 비교하며 괄호의 짝이 맞는지 체크

    - 스택이 비어 있으면 값 추가
    - 괄호의 짝이 맞으면 스택에서 제거
    - 괄호의 짝이 맞지 않고, 괄호가 (, {, [인 경우 스택에 추가

- 반복문을 돌면서 스택이 비게되면 결과 값 +1 추가


<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
