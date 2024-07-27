# 99클럽 코테 스터디 6일차 TIL + 의상

### 의상

![240727](https://github.com/user-attachments/assets/0fab891e-7092-4f70-829e-ee6bbb7545c1)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/6a035c82-e70d-4ece-8bd1-0de307151b79)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/4939253a-5042-4231-858f-8ea3ce22d4c0)

#### 문제 요지
- 2차원 배열에 담긴 여러 종류의 여러 옷들이 있을 때 겹치지 않고 매칭될 경우의 수 

#### 문제 풀이
- 주어진 2차원 배열에서 종류의 값을 key 값, 해당 종류의 의상 개수를 value 값으로 지정
- key 값을 기준으로 매칭될 value 값들의 모든 경우의 수를 추출
- 모든 경우에 수에서 아예 입지 않은 경우의수 1을 빼줌

##### 1차 시도
- 전체 길이 + 1번째 키값 * 나머지 key 값 개수 + 2번째 키값 * 나머지 key 값 개수 방식 고안

##### 문제점
- 고려하지 못한 경우의 수가 너무 많음

##### 해결방안
- (a1+1)(a2+1)(a3+1)⋯(an+1)−1 공식을 이용하여 다른 방식 고안


<br>

## 공부 내용 정리

### 수학 공식 추출

1. 종류가 **1가지**인 경우
- ex : 의상 A가 a 개
- 한가지 종류의 옷을 1번씩 입는 것

    -> a개

    -> ( a + 1 ) - 1 = a

2. 종류가 **2가지**인 경우
- ex : 의상 A a개, 의상 B, b개
- 의상 A, B를 한가지 씩 입는 경우 a, b
- 의상 A B를 섞어 입는 경우 ab

    -> a + b + ab 개

    -> ( a + 1 )(b + 1) - 1 = ab + a + b + 1 - 1

3. 종류가 **3가지**인 경우
- ex : 의상 A a개, 의상 B, b개, 의상 C c개
- 의상 A, B, C를 한가지 씩 입는 경우 : a, b, c
- 의상 A B / A C / B C 2종류씩 섞는 경우 : ab, ac, bc
- 의상 A B C를 섞어 입는 경우 : abc

    -> a + b + c + ab + ac + bc + abc개

    -> ( a + 1 )(b + 1)(c + 1) - 1 = abc + ab + ac + bc + a + b + c + 1 - 1

4. 종류가 **4가지**인 경우
- 의상 A a개, 의상 B, b개, 의상 C c개, 의상 D d개
- 의상 A, B, C, D를 한가지 씩 입는 경우 : a, b, c, d
- 의상 A B / A C / A D /  B C / B D / C D 2종류씩 섞는 경우 : ab, ac, ad, bc, bd, cd
- 의상 A B C / A B D / B C D 를 섞어 입는 경우 : abc, abd, bcd
- 의상 A B C D를 섞어 입는 경우 : abcd

    -> a + b + c + d + ab + ac + ad + bc + bd + cd + abc + abd+ bcd + abcd개

    -> ( a + 1 )(b + 1)(c + 1)(d + 1) - 1 = abcd + abc + abd + acd + bcd + ab + ac + ad + bc+ bd + cd + a + b + c + d + 1 - 1

#### 최종 공식 : (a + 1)(b + 1)(c + 1)...(해당 종류 옷의 수 + 1) -1

<br>

### containsKey
- key와 일치하는 데이터가 있는지 여부를 반환

### replace
- HashMap에 특정 키 값의 value 값을 수정하는 메서드


<br>
<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
