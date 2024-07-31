# 99클럽 코테 스터디 9일차 TIL + 더 맵게

### 더 맵게

![240730](https://github.com/user-attachments/assets/72d1448a-c7af-474f-9296-4f559cb3464d)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/ad1a22b8-3943-4efa-bb5e-e9c745b9ced2)

#### 문제 요지
- 큐에서 가장 작은수와 두번째로 작은수 추출 후 삭제
- 주어진 연산을 이용하여 계산 결과를 큐안에 삽입
- 위 두 방법을 이용하여 큐안에 수가 K 이상일 때까지 반복



<br>

## 공부 내용 정리

### Heep 자료구조
- 우선순위 큐가 Heep 자료구조를 이용하여 구현됨
- 최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조

### 완전이진트리
- 마지막 레벨을 제외한 모든 노드가 채워져있어야함
- 모든 노드들은 왼쪽부터 채워져있어야 함

![binaryTree](https://github.com/user-attachments/assets/b7b9a5e3-588d-4969-af8c-9afb290f7256)

참고자료 : https://st-lab.tistory.com/205

<br>

### 큐(Queue) 선언
- new LinkedList<>()
- new PriorityQueue<>() : 낮은 우선순위로 값 정렬
- new PriorityQueue<>(Collections.reverseOrder()) : 높은 우선순위로 값 정렬

### 큐(Queue) 메서드
- add() : 맨뒤에 값 삽입, 실패 시 IllegalStateException 발생
- offer() : 맨뒤에 값 삽입, 실패 시 false 반환
- remove() : 맨 앞에 있는 값 반환 후 삭제, 실패 시  NoSuchElementException 발생
- remove(value) : 특정 값 반환 후 삭제, 실패 시  NoSuchElementException 발생
- poll() : 맨 앞에 있는 값 반환 후 삭제, 실패 시 null 반환
- element() : 맨 앞에 있는 값 반환, 실패 시 NoSuchElementException 발생
- peek() : value / 공백이면 null 반환
- clear() : 값 초기화, 반환 값x
- size() : 사이즈 반환
- contains() : 값 존재하는지 여부 체크(true/false)
- isEmpty() : 공백인지 여부 체크(true/false)



<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
