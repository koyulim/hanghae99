# 99클럽 코테 스터디 4일차 TIL + JadenCase 문자열 만들기

### JadenCase 문자열 만들기

![240725](https://github.com/user-attachments/assets/68436e99-c046-40ba-8015-89c373660c7a)

#### 문제 요지
- 문자열 내의 단어들중 첫문자는 대문자 이외 문자들은 소문자로 변형
- 첫문자가 알파벳이 아닌 경우에는 무시

#### 문제 풀이
- 문자열을 모두 소문자로 변환
- 문자열의 첫번 째 값 대문자로 변환
- 이후 반복문 돌면서 띄어쓰기 값 기준으로 인덱스 값 추출
- 추출한 값의 다음 값을 대문자로 변형


##### 1차 시도
- 반복문 조건에 인덱스 값이 0보다 클 경우만 입력

##### 문제점
- 문자열 마지막 값에 띄어쓰기가 있다면 그 다음 인덱스 값을 가져오려하는데 인덱스 값이 없어서 오류 발생

##### 해결방안
- 반복문 조건절에 추출하려는 인덱스의 값의 조건 추가


<br>

## 공부 내용 정리

### StringBuilder
- setCharAt() : 특정 위치에 있는 문자의 값을 변형

### String vs StringBuffer vs StringBuidler
- String

    - 불변(immutable)한 문자열을 처리
    - 객체가 생성되면 그 값은 변경되지 않고 **새로운 객체**로 추가 및 변경됨

- StringBuffer

    - 가변(mutable)한 문자열을 처리
    - 문자열을 생성하거나 변경하게 되면 **기존의 객체**로 추가 및 변경이 됨
    - **멀티쓰레드** 환경에서 안정적임

- StringBuidler

    -  가변(mutable)한 문자열을 처리
    - 문자열을 생성하거나 변경하게 되면 **기존의 객체**로 추가 및 변경이 됨
    - **싱글쓰레드** 환경에서 빠른 성능을 가짐

### toLowerCase()
- 대문자 -> 소문자로 변형

### toUpperCase()
- 소문자 -> 대문자로 변형



<br>
<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
