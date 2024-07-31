# 99클럽 코테 스터디 10일차 TIL + 이중 우선순위 큐

### 이중 우선순위 큐

![240731](https://github.com/user-attachments/assets/b31d617c-ebd2-4e25-9c91-f30d40cabfda)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/36b6b9f1-7767-442c-beab-3d8f01ec063e)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/89dccf7b-e2ed-49f5-a5c4-3e7a30a256c3)

#### 문제 요지
- 큐에 주어진 숫자를 삽입하고 최대 최소값을 제거 할 수 있어야함
- 최대 값과 최소 값에 해당하는 큐를 생성하여 주어진 숫자를 삽입
- 명령어에 따라 최소/최대 값을 제거 후 해당 큐의 값을 초기화한 최대/최소 값 큐에 생성

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
