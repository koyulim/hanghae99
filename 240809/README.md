# 99클럽 코테 스터디 19일차 TIL + 구명보트

### 구명보트

![240809](https://github.com/user-attachments/assets/1ba0506a-7152-4a75-8e2e-fa33c3d9bf59)

#### 문제 요지
- 구명보트를 가능한 한 적게 사용하여 모든 사람을 구출하는 최적의 방법을 찾는 것
- 탐욕법(Greedy) 사용

<br>

## 문제 구현 알고리즘
- 오름차순 정렬
- 투 포인터를 이용하여 시작점 인덱스와 끝점 인덱스를 비교하면서 반복문 돌기
- 각 인덱스의 값을 더하여 limit보다 작거나 같을 경우 인덱스를 중심과 가깝게 1칸씩 이동

    - 무게 초과 안하면 가장 무거운 사람 + 가장 가벼운 사람을 태움

- 각 인덱스의 값을 더하여 limit보다 클경우 배열에서 큰 값을 가지고 있는 값의 인덱스 값을 중심 쪽으로 1칸 이동

    - 무게 초과시 가장 무거운 사람을 태움

- 한명이 남아있는 경우 한명만 태움

따라서, 이 방식은 각 단계에서 가능한 최선의 선택을 함으로써 구명보트를 최소한으로 사용하도록 함


<br>

## 공부 내용 정리

### 탐욕법(Greedy)
- 최적화 문제를 해결하는 데 사용되는 알고리즘 디자인 기법
- 문제를 해결하는 과정에서 매 순간 최선이라고 생각되는 선택을 하여 최적해를 구함
- 부분적인 최적해를 통해 전체 문제의 최적해를 찾는 것

### 탐욕법의 작동 원리
- 탐욕적 선택 속성

    - 현재 상황에서 최적의 선택을 하는 방식
    - 이 선택은 이후의 선택들에 영향을 미칠 수 있지만, 현재 단계에서는 그것이 최선이라고 판단함

- 최적 부분 구조

    - 현재 단계에서의 선택이 이후 단계에서의 최적해를 구성하는 데 영향을 주지 않아야 함
    - 즉, 각 단계에서의 최적 선택이 결과적으로 전체 문제의 최적해로 이어져야 함

### 탐욕법의 장점
 - 단순함
 
    - 알고리즘이 단순하고 이해하기 쉬움

- 빠른 실행 시간

    - 보통의 경우 동적 계획법(Dynamic Programming)이나 분할 정복(Divide and Conquer) 방법보다 빠르게 문제를 해결할 수 있음

### 탐욕법의 단점
- 최적해 보장 불가
    
    - 항상 전체 문제의 최적해를 보장하지는 않음
    - 문제에 따라 탐욕적 접근이 비최적해를 초래할 수 있음

- 문제 특성에 따라 적용 가능 여부 결정

    - 탐욕법이 항상 최적해를 보장하는 문제에만 적용할 수 있음
    - 이러한 문제는 최적 부분 구조와 탐욕적 선택 속성을 만족해야 함

<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
