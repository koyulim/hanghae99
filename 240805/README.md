# 99클럽 코테 스터디 15일차 TIL + Prefix and Suffix Search

### Prefix and Suffix Search


#### 번역

#### 745. 접두사 및 접미사 검색

접두사와 접미사로 단어를 검색하는 특수 사전을 디자인합니다.

WordFilter 클래스를 구현합니다.

- WordFilter(string[] words) 사전에 있는 단어로 개체를 초기화합니다.
- f(string pref, string suff) 접두사 pref와 접미사 suff가 있는 사전에 있는 단어의 인덱스를 반환합니다. 
- 유효한 인덱스가 두 개 이상인 경우 가장 큰 인덱스를 반환합니다. 
- 사전에 해당 단어가 없으면 -1을 반환합니다.

조건
- 1 <= words.length <= 104
- 1 <= words[i].length <= 7
- 1 <= pref.length, suff.length <= 7
- words[i], pref와 suff는 영문 소문자로만 구성됩니다.
- 함수 f에 대해 최대 104번의 호출이 이루어집니다.

#### 입출력 예시1


#### 번역

Input
- ["WordFilter", "f"] [[["apple"]], ["a", "e"]]

Output
- [null, 0]

Explanation
- WordFilter wordFilter = new WordFilter(["apple"]);
- wordFilter.f("a", "e"); //인덱스 0에 있는 단어의 접두사 = "a" 및 접미사 = "e"이므로 0을 반환합니다.

#### 문제 요지
- 주어진 words 배열의 값들이 주어진 pref(접두사) + suff(접미사) 의 값들로 이루어져 있는지 확인
- 주어진 접두사와 접미사로 이주어진 값들이 여러개라면 words 배열의 최대 INDEX 값을 출력

<br>

## 공부 내용 정리



<br>
#99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL
