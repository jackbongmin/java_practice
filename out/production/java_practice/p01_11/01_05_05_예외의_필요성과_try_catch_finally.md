# 5일차 5교시 실습 — 예외의 필요성과 try-catch-finally

## 이번 시간에 할 일

- 타입은 맞는데 실행 중에만 터지는 실패(0으로 나눔·null 참조)를 직접 재현합니다.
- try-catch가 실패 코드와 대응을 나누고, catch는 타입이 맞아야 잡고, finally는 어느 경로든 실행됨을 출력으로 확인합니다.

## 실습 파일

- `chapter11/ExceptionMessage.java`
- `chapter11/ExceptionEx.java` · `ExceptionEx2.java` · `ExceptionEx3.java`
- `chapter11/TryCatchFinally.java`

## 미션

### 5-1. 컴파일은 되는데 실행이 멈춘다
`ExceptionMessage`를 실행하기 전에 무슨 일이 일어날지 예측해 적고 실행합니다. 콘솔에 찍힌 예외 이름과, `str.length()`가 실패한 이유를 `returnNull()`의 반환값까지 거슬러 올라가 기록합니다.

### 5-2. try로 감싸 흐름을 잇는다
`ExceptionMessage`의 `main` 본문을 try로 감싸고 아래처럼 잡아 안내 문구를 출력하도록 고칩니다.

```java
try {
    String str = returnNull();
    System.out.println(str.length());
} catch (NullPointerException e) {
    System.out.println("값이 없어 길이를 잴 수 없습니다.");
}
```

실행해 프로그램이 종료 대신 정상 흐름으로 끝나는지 확인하고, 원래대로 되돌립니다.

### 5-3. 같은 구조, 다른 결과
`ExceptionEx`와 `ExceptionEx2`를 각각 예측한 뒤 실행합니다. catch 구조는 같은데 한쪽만 catch로 들어간 이유를 `100 / 0` 과 `100 / 10` 의 차이로 설명합니다.

### 5-4. catch는 타입이 맞아야 잡는다
`ExceptionEx`의 catch 타입을 `catch (ArithmeticException e)` 에서 `catch (NullPointerException e)` 로 바꿔 실행합니다. 예외가 잡히지 않고 프로그램이 종료되는 것을 확인하고, 왜 통과했는지 catch 타입과 발생 예외 타입의 관계로 적은 뒤 되돌립니다.

### 5-5. 예외 객체는 원인을 전달한다
`ExceptionEx3`를 실행해 안내 문구와 스택 추적(`e.printStackTrace()`)이 함께 나오는 것을 확인합니다. 사용자용 문장과 스택 추적이 각각 누구에게 무엇을 전달하는지 한 줄씩 구분합니다.

### 5-6. finally는 어느 경로든 실행된다
`TryCatchFinally`를 실행해 `예외가 발생했습니다.` 와 `finally가 실행되었습니다.` 가 나오는 순서를 확인합니다. `100 / 0` 을 `100 / 10` 으로 바꾸면 어느 블록이 실행되고 어느 블록이 건너뛰어질지 예측한 뒤 실행해 확인하고 되돌립니다.

## 스스로 점검

- 타입이 완벽히 맞아도 실행 중에만 드러나는 실패가 있음을 두 예외로 재현했다.
- catch가 잡는 조건이 "try로 감쌌는가"가 아니라 "예외 타입이 맞는가"임을 5-4로 설명할 수 있다.
- finally가 정상·예외 어느 경로 뒤에도 실행됨을 5-6의 두 입력으로 보일 수 있다.

## 막혔을 때

- 5-4에서 예외가 잡히지 않으면 콘솔에 빨간 스택 추적이 뜨고 프로그램이 종료됩니다. 이것이 "안 잡힌" 모습입니다.
- 파일·DB 연결을 닫는 코드처럼 "반드시 해야 할 마무리"는 finally에 둡니다.

## 제출 결과물

- 5-1에서 역추적한 예외 이름과 원인 한 문장
- 5-4에서 catch 타입 불일치로 종료됐을 때의 콘솔 출력
- 5-6 두 입력(`0`으로 나눔 / `10`으로 나눔)에서 실행된 블록과 건너뛴 블록 비교
