# 99클럽 코테 스터디 8일차 TIL + 기능 개발

### 기능 개발

![240729](https://github.com/user-attachments/assets/99128ebd-5406-4ec3-bd26-983d5aa876d9)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/302fefd0-ef56-4b33-b4af-81dd68067e66)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/1e784f7a-4bcd-4546-b5bf-d7019a36b74b)

#### 문제 요지
- 같은 기간에 기능을 완료한 팀의 개수를 리스트로 출력
- 프로그래머스 팀의 작업 가능한 계산 일자를 큐에 값 삽입
- 반복문을 돌면서 큐의 값을 하나씩 비교하면서 제거



<br>

## 공부 내용 정리

### 스택(Stack)과 큐(Queue)
- 스택(Stack) : 후입선출, 마지막에 넣은 값을 먼저 출력
- 큐(Queue) : 선입선출, 먼저 넣은 값을 먼저 출력

<img width="451" alt="Stack_Queue" src="https://github.com/user-attachments/assets/a11c8238-f415-46b2-8b04-73a435cceefd">

#### 큐(Queue) 선언
- new LinkedList<>()
- new PriorityQueue<>() : 낮은 우선순위로 값 정렬
- new PriorityQueue<>(Collections.reverseOrder()) : 높은 우선순위로 값 정렬

#### 큐(Queue) 메서드
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
