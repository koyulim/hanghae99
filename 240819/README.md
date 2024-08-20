# 99클럽 코테 스터디 29일차 TIL + Longest Increasing Subsequence

### Longest Increasing Subsequence

![240819](https://github.com/user-attachments/assets/c62752d7-4a94-4186-a372-1868471f9c08)

![2408291](https://github.com/user-attachments/assets/a65a2e27-f256-4ea0-91f1-5502c2944aff)

정수 배열 nums가 주어지면, 엄격하게 증가하는 가장 긴 길이를 반환합니다.

하위 시퀀스는 나머지 요소의 순서를 변경하지 않고 일부 요소를 삭제하거나 요소를 전혀 삭제하지 않고 다른 배열에서 파생될 수 있는 배열입니다.

후속 조치: 

O(n log(n)) 시간 복잡도에서 실행되는 알고리즘을 생각해 낼 수 있습니까?

#### 입출력 예시1
![ex1](https://github.com/user-attachments/assets/754b7297-9e26-4e41-bdc9-2935e01c7a91)

가장 긴 증가 부분 수열은 [2,3,7,101]이므로 길이는 4입니다.

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/975cff0b-60cb-4996-9d80-97a7ef23a0f8)

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/d03a14ba-3c48-4fc7-9153-57a20c41447a)

#### 문제 요지
- 주어진 배열중 최장 증가 부분 수열 추출
- O(n log(n)) 시간 복잡도에 맞춰 실행 필요
- 이분 탐색 알고리즘 기법 사용
- 동적 프로그래밍 알고리즘 설계 기법 사용

<br>

## 문제 구현 알고리즘
- 첫 번째 요소 nums[0]을 list에 추가
- 반복문을 통해 주어진 배열을 순차적으로 탐색

    - nums[i] > list의 마지막 요소 : list에 해당 요소를 추가
    - nums[i] < list의 마지막 요소 : 이분 탐색을 통해 list 내에서 nums[i]가 들어갈 위치를 찾고 해당 위치에 nums[i]를 대체

- 이분 탐색을 통해 위치 찾기

    - left와 right를 설정한 후, while문을 통해 mid를 계산하여 이분 탐색을 진행
    - list[mid]가 target보다 작으면, left를 mid + 1로 이동
    - list[mid]가 target보다 크거나 같으면, right를 mid로 이동
    - left가 nums[i]가 삽입될 위치가 됨

- 반복문이 종료되면 list의 크기가 최종적으로 가장 긴 증가하는 부분 수열의 길이가 됨

### 예시 데이터의 변화
- nums = [10, 9, 2, 5, 3, 7, 101, 18]

1. list = [10]
2. nums[1] = 9 (10보다 작기 때문에 10을 9로 대체) -> list = [9]
3. nums[2] = 2 (9보다 작기 때문에 9를 2로 대체) -> list = [2]
4. nums[3] = 5 (2보다 크기 때문에 5 추가) -> list = [2, 5]
5. nums[4] = 3 (5보다 작기 때문에 5를 3으로 대체) -> list = [2, 3]
6. nums[5] = 7 (3보다 크기 때문에 7 추가) -> list = [2, 3, 7]
7. nums[6] = 101 (7보다 크기 때문에 101 추가) -> list = [2, 3, 7, 101]
8. nums[7] = 18 (101보다 작기 때문에 101을 18로 대체) -> list = [2, 3, 7, 18]
최종적으로 list의 길이는 4이며, 이는 가장 긴 증가하는 부분 수열의 길이입니다.

<br>

## 공부 내용 정리

### 최장 증가 부분 수열(LIS: Longest Increasing Subsequence)
- 어떤 임의의 수열이 주어질 때, 이 수열에서 몇 개의 수들을 제거해서 부분수열을 만들 수 있음
- 이때 만들어진 부분수열 중 오름차순으로 정렬된 가장 긴 수열

참고 자료 : https://namu.wiki/w/%EC%B5%9C%EC%9E%A5%20%EC%A6%9D%EA%B0%80%20%EB%B6%80%EB%B6%84%20%EC%88%98%EC%97%B4


### 이분 탐색
- 오름차순 또는 내림차순으로 정렬된 배열에 적용 가능한 탐색 기법
- 정렬된 배열에서 특정 값을 찾을 때 정중앙에 위치한 값을 활용

참고 자료 : https://charles098.tistory.com/133




<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
