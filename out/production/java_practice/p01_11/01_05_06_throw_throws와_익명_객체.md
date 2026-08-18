# 5일차 6교시 실습 — throw·throws와 익명 객체

## 이번 시간에 할 일

- `throws`로 처리 책임을 호출자에게 넘기고, `throw`로 업무 규칙 위반을 직접 예외로 표현하는 두 방향을 구분합니다.
- catch를 반복문 안에 두는지 밖에 두는지에 따라 반복 유지가 갈리는 것을 보고, 익명 객체가 인터페이스 구현을 그 자리에서 만든다는 것을 직접 써 봅니다.

## 실습 파일

- `chapter11/ThrowsEx.java`
- `chapter11/Customer.java` · `CustomerException.java`
- `chapter11/ExceptionDoWhile.java` · `ExceptionDoWhileRefact.java`
- `chapter11/StatementWithTwoArgs.java` · `StatementWithTwoArgsTest.java`

## 미션

### 6-1. quote는 계산, run은 결정
`ThrowsEx`를 실행해 출력을 확인합니다. `quote()`가 하는 일과 `run()`이 하는 일을 나눠 적습니다. `quote()`의 `throws ArithmeticException` 을 지워도 컴파일되는지 확인하고, 컴파일된다면 이 예외가 checked인지 unchecked인지 판정한 뒤 선언을 되돌립니다.

### 6-2. 규칙을 어기면 직접 던진다
`CustomerException`을 실행해 `IllegalArgumentException`이 발생하는 것을 확인합니다. 예외를 발생시키는 **조건**, 예외 **타입**, **메시지** 세 가지를 코드에서 각각 짚습니다. `new Customer("김경록", 16)` 의 나이를 `20`으로 바꾸면 예외가 나지 않는 것을 확인하고 되돌립니다.

### 6-3. catch가 없으면 반복이 끊긴다
`ExceptionDoWhile`을 실행해 정상 숫자를 몇 번 입력한 뒤 `0`을 입력합니다. 프로그램이 어떻게 끝나는지 관찰하고, 멈춘 지점을 `100 / input` 으로 지목합니다. (정상 종료하려면 `9`를 입력)

### 6-4. catch를 안쪽에 두면 반복이 이어진다
`ExceptionDoWhileRefact`를 실행해 같은 자리에 `0`을 입력합니다. 이번에는 안내 후 다시 입력을 받는 것을 확인하고, 차이를 만든 것이 catch의 **위치**임을 두 파일의 try 범위를 비교해 적습니다.

### 6-5. catch를 반복문 밖으로 옮기면
`ExceptionDoWhileRefact`의 try를 `do` 안쪽이 아니라 `do-while` 전체를 감싸도록 잠깐 옮겨 `0`을 입력합니다. 반복이 이어지지 않고 끝나는 것을 확인하고, "다시 입력받게 하려면 catch가 어디 있어야 하는가"를 한 문장으로 정리한 뒤 되돌립니다.

### 6-6. 익명 객체로 그 자리에서 구현한다
`StatementWithTwoArgsTest`는 람다로 `StatementWithTwoArgs` 를 구현합니다. 같은 인터페이스를 이번에는 **익명 객체**로 구현하는 코드 조각을 직접 작성합니다.

```java
StatementWithTwoArgs stmt = new StatementWithTwoArgs() {
    @Override
    public int calculate(int val1, int val2) {
        return val1 + val2;
    }
};
System.out.println(stmt.calculate(10, 20));   // 30
```

`30`이 나오는지 확인하고, 실제로 새로 정한 것이 몸통 한 줄(`return val1 + val2;`)뿐임을 표시합니다. 이 조각은 관찰용이니 확인 후 지웁니다.

## 스스로 점검

- `throw`(예외를 발생)와 `throws`(전파를 선언)의 차이를 자기 코드로 구분할 수 있다.
- 오늘 실습의 예외가 모두 unchecked라서 `throws` 선언이 생략 가능함을 6-1로 설명할 수 있다.
- 같은 예외를 잡아도 catch 위치에 따라 반복 유지가 갈린다는 것을 6-4·6-5로 보일 수 있다.

## 막혔을 때

- `Scanner`가 입력을 기다리면 콘솔이 멈춘 것처럼 보입니다. 값을 입력하고 엔터를 누르세요.
- 6-6의 익명 객체와 다음 교시의 람다는 결국 같은 계약(`calculate`)을 채웁니다. 무엇이 사라지는지 눈여겨봅니다.

## 제출 결과물

- 6-1의 `throws` 생략 후 컴파일 여부와 checked/unchecked 판정
- 6-4와 6-5의 catch 위치별 실행 결과(입력 `0`) 비교
- 6-6에서 직접 작성한 익명 객체 코드 조각과 `calculate(10, 20)` 출력
