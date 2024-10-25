# java-racingcar-precourse

## 구현할 기능 목록

(**bold**로 표시한 건 새로 추가한 요구사항)

- [x] 자동차 이름 입력받는 기능
    - 이름은 쉼표(,) 기준으로 구분한다.
- [x] 자동차 생성하는 기능
    - 자동차 이름은 5자 이하여야 한다.
    - **자동차 이름은 비어있을 수 없다.**
    - **자동차 이름에 공백이 포함되면 안 된다.**
    - **자동차 이름은 중복될 수 없다.**
- [x] 시도할 횟수 입력받는 기능
    - 숫자여야 한다.
- [x] 자동차 움직이는 기능
    - 0~9사이의 무작위 값을 생성하는 기능
    - 4이상의 값이 전달되면 전진한다.
- [x] 차수별 결과 출력하는 기능
    - 각 차수가 끝나면 실행 결과를 출력한다.
- [x] 우승자 판정하는 기능
    - 가장 멀리 움직인 자동차가 우승
- [ ] 우승자 출력하는 기능
    - 우승자가 여러 명이면 쉼표를 이용하여 구분한다.

## 실행 결과 예시

```text
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 횟수는 몇 회인가요?
5

실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자 : pobi, jun
```
