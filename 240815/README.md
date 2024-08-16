# 99클럽 코테 스터디 25일차 TIL + Evaluate Division

### Evaluate Division

![240815](https://github.com/user-attachments/assets/f39def70-26d9-4b57-98d7-99bb0d1be507)

번역

변수 쌍 equations의 배열과 실수 values의 배열이 제공됩니다. 
여기서 equations[i] = [Ai, Bi] 및 values[i]는 방정식 Ai / Bi = values[i]를 나타냅니다. 
각 Ai 또는 Bi는 단일 변수를 나타내는 문자열입니다.

또한 몇 가지 queries가 제공되는데, 
여기서 queries[j] = [Cj, Dj]는 Cj / Dj = ?에 대한 답을 찾아야 하는 j번째 쿼리를 나타냅니다.

모든 쿼리에 대한 답변을 반환합니다. 단일 답을 결정할 수 없는 경우 -1.0을 반환합니다.

참고: 입력은 항상 유효합니다. 쿼리를 평가해도 0으로 나누는 결과가 발생하지 않으며 모순도 없다고 가정할 수 있습니다.

참고: 방정식 목록에 나타나지 않는 변수는 정의되어 있지 않으므로 이에 대한 답을 결정할 수 없습니다.

#### 제약 조건

![Constraints](https://github.com/user-attachments/assets/40043d44-6b7c-42bb-ae0c-607bf8abed7c)

#### 입출력 예시1

![ex1](https://github.com/user-attachments/assets/e5a1635e-3ddc-45e2-9285-7ef83f38c8d2)

#### 입출력 예시2

![ex2](https://github.com/user-attachments/assets/f7699650-0cc1-4340-9501-841a961da954)

#### 입출력 예시3

![ex3](https://github.com/user-attachments/assets/db7b19e8-c6d7-4d85-b056-833298017c02)

#### 문제 요지
- 주어진 방정식과 값을 가지고 새로 주어진 쿼리 방정식의 계산한 결과를 반환
- 값을 구할 수 없는 경우에는 -1 반환

#### 알고리즘
- 주어진 방정식과 방정식의 값을 이용하여 각 문자에 맞는 계산신 추출
- 새로운 방정식을 가지고 위에서 구한 값으로 결과 추출



<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
