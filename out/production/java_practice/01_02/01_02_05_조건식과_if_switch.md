# 2일차 5교시 실습 — 조건식과 if, switch

## 이번 시간에 할 일

- if의 괄호 안에 들어갈 수 있는 것이 **boolean 하나뿐**임을 오류로 확인합니다.
- if / else if / else가 **위에서 아래로** 검사한다는 것과, 순서를 바꾸면 결과가 바뀌는 경우를 재현합니다.
- 값 하나로 갈리는 분기에서 switch·화살표 switch·삼항 연산자를 실행으로 구분합니다.

## 실습 파일

- `chapter06/IfTrueExam.java` / `IfFalseExam.java`
- `chapter06/CompanyHRSystem.java`
- `chapter06/IfComparisonOperation.java` / `IfLogicalOperation.java`
- `chapter06/ElseExam.java`
- `chapter06/IfElseIfExample.java`
- `chapter06/SwitchCaseSeason.java` / `NewSwitchCaseSeason.java` / `NewSwitchCaseDaysOfMonth.java`
- `chapter05/TernaryOperatorEx.java`

## 미션

### 5-1. if 괄호에는 숫자를 못 넣는다
`IfTrueExam`과 `IfFalseExam`을 실행해 출력이 갈리는 것을 확인합니다. `IfTrueExam`의 `if (true)`를 `if (1)`로 바꿔 **컴파일 오류 메시지를 원문 그대로** 적은 뒤 되돌립니다.
→ 오류가 "if의 입력은 boolean이어야 한다"는 뜻임을 확인합니다.

### 5-2. || 와 && 는 답을 바꾼다
`CompanyHRSystem`을 실행하고 경력 3, 프로젝트 12를 입력해 결과를 적습니다. `||`를 `&&`로 바꿔 같은 입력으로 다시 실행하고, 두 결과가 갈린 이유를 적습니다.

### 5-3. x를 음수로 바꾸면 몇 줄이 찍히나
`IfLogicalOperation`을 실행해 두 줄을 확인합니다. `int x = 5;`를 `int x = -5;`로 바꿔 **실행 전에** 세 if 중 몇 줄이 찍힐지 예측하고 실행해 맞춰 봅니다. 세 번째 if가 언제 출력되는지 `!`로 설명합니다.

### 5-4. == true 는 무엇을 중복하나
`IfComparisonOperation`에서 `if (isAdult)`를 `if (isAdult == true)`로 바꿔 실행하고 출력이 같음을 확인합니다. `== true`가 무엇을 중복하는지 한 줄로 적습니다.

### 5-5. 위에서부터 검사한다
`IfElseIfExample`을 실행해 "치아"를 확인합니다. `hospitalName`을 "서울 밝은 안과"로 바꿔 예측 후 실행합니다. 그다음 "치과"와 "안과"를 **둘 다** 포함하는 이름을 넣어, 위에 있는 조건이 먼저 걸리는 것을 확인합니다.

### 5-6. 순서를 잘못 두면 오류 없이 틀린다
점수를 등급으로 판정하는 if-else if를 새로 작성하되, 넓은 조건(`score >= 70`)을 맨 위에 둡니다. 95점을 넣으면 C가 나오는데도 오류가 없음을 확인합니다. 그다음 좁은 조건(`>= 90`)부터 오도록 순서를 고쳐 A가 나오게 합니다.

### 5-7. break를 지우면 이어서 실행된다
`SwitchCaseSeason`을 실행해 "봄"을 확인합니다. `case 3:` 아래의 `break;`를 지우고 실행해 무엇이 이어서 찍히는지(fall-through) 적은 뒤 되돌립니다.

### 5-8. 화살표 switch와 삼항
`NewSwitchCaseSeason`(화살표 switch)에는 break가 없는데도 이어서 실행되지 않음을 확인합니다. `NewSwitchCaseDaysOfMonth`의 `month`를 13으로 바꿔 실행하고, default의 `throw`가 만든 **예외 이름·메시지를 원문 그대로** 적은 뒤 되돌립니다. 이어서 `TernaryOperatorEx`의 `enabled`를 0으로 바꿔 "Off"가 나오는 것을 확인하고, 같은 판정을 if-else로도 써 봅니다.

## 스스로 점검

- 5-1의 오류로 if의 입력이 boolean뿐임을 설명할 수 있다.
- 5-6에서 조건 순서가 틀리면 오류 없이 **틀린 결과**가 나온다는 것을 안다.
- 5-7의 fall-through와 5-8의 화살표 switch 차이를 break 유무로 설명할 수 있다.

## 막혔을 때

- `if (1)`에서 나는 오류는 `int cannot be converted to boolean` 형태입니다. 값이 아니라 타입 문제입니다.
- switch에서 여러 case가 한꺼번에 찍히면 break가 빠진 것은 아닌지 확인하세요.

## 제출 결과물

- 5-1의 컴파일 오류 메시지 원문
- 5-3의 예측표와 실제 출력 대조
- 5-6의 잘못된 순서 · 고친 순서 코드 조각과 각 출력
- 5-8의 예외 메시지 원문
