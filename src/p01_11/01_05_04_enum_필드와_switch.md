# 5일차 4교시 실습 — enum 필드와 switch

## 이번 시간에 할 일

- enum 상수가 단순한 이름표가 아니라 값과 동작을 가진 객체임을 `getValue()` 출력으로 확인합니다.
- enum switch에서 값 하나라도 빠지면 컴파일러가 먼저 막는 것을 직접 만들어 봅니다.

## 실습 파일

- `chapter11/Seasons.java` · `SeasonsTest.java`
- `chapter11/Role.java` · `EnumSwitch.java` · `EnumSwitchErr.java`
- `chapter11/User.java` · `UserTest.java`

## 미션

### 4-1. 값 3은 어디서 오는가
`SeasonsTest`를 실행하기 전에 출력을 예측해 적고 실행합니다. `Seasons.java`에서 `FALL(3)`의 값 `3`이 지나는 자리를 순서대로 표시합니다.

`상수 선언 FALL(3)` → `생성자 인수` → `final 필드 value` → `getValue()`

### 4-2. 이름표가 아니라 객체다
`SeasonsTest`에 다음을 추가해 이 값이 문자열이 아니라 `Seasons` 타입임을 확인하고 지웁니다.

```java
System.out.println(Seasons.FALL.getClass());
```

### 4-3. 밖에서 새로 만들 수 없다
`Seasons.java`의 생성자 `Seasons(int value)` 앞에 `public`을 붙여 컴파일합니다. 오류 메시지를 원문 그대로 기록하고 되돌린 뒤, 밖에서 `new Seasons(5)` 를 허용하면 무엇이 깨지는지 한 문장으로 적습니다.

### 4-4. switch는 값마다 갈 길을 정한다
`EnumSwitch`를 실행해 출력이 `1`임을 확인합니다. `Role role = Role.ADMIN;` 을 `Role.USER` 로 바꾸면 결과가 무엇이 될지 예측하고 실행해 맞춰 본 뒤 되돌립니다.

### 4-5. 하나라도 빠지면 컴파일이 막는다
`EnumSwitchErr`를 엽니다. 주석 처리된 switch 블록의 주석을 풉니다. `case USER` 가 빠진 상태로 컴파일해 오류 메시지를 원문 그대로 기록합니다. 그다음 `case USER -> 3;` 를 채워 통과시키고, 확인 후 다시 원래대로 주석 처리해 되돌립니다.

### 4-6. 문자열 if-else였다면
4-5의 누락을 `String`으로 분기하는 `if-else`로 짰다면 컴파일러가 알려 줬을지 한 문장으로 적습니다.

## 스스로 점검

- enum 상수 하나가 값·생성자·필드·메서드를 함께 가진 객체임을 `FALL(3)` 흐름으로 설명할 수 있다.
- enum switch 표현식이 값을 누락하면 컴파일이 막힌다는 것을 직접 재현했다.
- `Role`에 새 값이 추가될 때 어느 코드가 "고쳐라"라고 알려 주는지 안다.

## 막혔을 때

- `EnumSwitchErr`는 원래 주석 처리되어 있습니다. 미션을 위해 잠깐 풀었다가 반드시 원래대로 되돌립니다.
- 화살표(`->`) switch는 문장이 아니라 값을 만드는 표현식이라, 모든 enum 값을 처리해야 컴파일됩니다.

## 제출 결과물

- 4-3의 생성자 `public` 컴파일 오류 메시지 원문
- 4-5의 case 누락 컴파일 오류 메시지 원문과 채워 넣은 코드 조각
- "제네릭이 막는 실수 / enum이 막는 실수"를 각각 한 문장으로 구분한 메모
