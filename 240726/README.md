# 99클럽 코테 스터디 5일차 TIL + 전화번호 목록

### 전화번호 목록

![240726](https://github.com/user-attachments/assets/9ef3e847-8e06-4d5c-a1e4-4191aaf875b5)

#### 문제 요지
- 리스트 내 배열의 값이 다른 값의 접두어로 있는지 확인
- 접두어 : 특정 값의 시작 값

#### 문제 풀이 1 - java startsWith 메서드 사용
- 주어진 배열을 sort로 정렬
- for문을 통해서 앞의 있는 값이 접두어로 시작하는지 확인

##### 1차 시도
- 처음에 조건절로 contains 메서드 사용

##### 문제점
- contains 메서드를 사용하니까 접두어가 아닌 문자열이 포함 되어져 있는지 여부를 모두 체크

##### 해결방안
- 조건절에 startsWith 메서드로 변경

<br>

#### 문제 풀이 2 - HashMap containsKey 메서드 사용
- 주어진 배열을 hashMap에 데이터 넣기
- for문을 통해서 map의 키값과 배열에 있는 접두어와 같은지 비교

<br>

## 공부 내용 정리

### startsWith
- 해당 String 값의 앞자리가 특정 값으로 시작되는지 여부 확인ㄴ

### containsKey
- HashMap에 특정 값의 키 값이 있는지 여부 확인


<br>
<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
