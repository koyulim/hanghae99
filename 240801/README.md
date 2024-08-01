# 99클럽 코테 스터디 11일차 TIL + 카드 뭉치

### 카드 뭉치



#### 입출력 예시1



#### 입출력 예시2



#### 문제 요지
- goal 배열에 있는 리스트 값이 cards1, cards2에 있는 배열의 값을 순서대로 뽑은 값인지 체크

<br>

## 공부 내용 정리

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
