package calculator.nextlevel;

import java.util.Scanner;

public class Calculator {
    // 속성
    private final int number1;
    private final int number2;

    // 생성자
    Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    // 기능
    Scanner scanner = new Scanner(System.in);
    // 모든 기능을 operator로 묶어서 해볼까..?
    void operator(int input1, int input2) {
        for (int i = 1; i > 0; i++) {
            if (input1 < 0 || input2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력해주세요. ");
                System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
                input1 = scanner.nextInt();
                System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
                input2 = scanner.nextInt();
            }
        }
        // 사칙연산 입력
        System.out.print("사칙연산 기호를 입력해주세요 (+, -, *, /): ");
        String input3 = scanner.next();
        for (int i = 1; i >0; i++) {
            if (input3.equals("+") || input3.equals("-") || input3.equals("*") || input3.equals("/")) {
                switch (input3) {
                    case "+":
                        int result1 = number1 + number2;
                        System.out.println("덧셈의 결과는 " + result1 + "입니다.");
                        break;
                    case "-":
                        int result2 = number1 - number2;
                        System.out.println("뺄셈의 결과는 " + result2 + "입니다.");
                        break;
                    case "*":
                        int result3 = number1 * number2;
                        System.out.println("곱셈의 결과는 " + result3 + "입니다.");
                        break;
                    case "/":
                        if (number2 == 0) {
                            System.out.println("분모가 0이면 나눗셈이 불가능합니다.");
                        } else {
                            int result4 = number1 / number2;
                            int result5 = number1 % number2;
                            System.out.println("나눗셈의 결과는 " + result4 + "이고, 나머지는 " + result5 + "입니다.");
                        }
                        break;
                    default:
                } break;
            } else {
                System.out.print("잘못 입력하였습니다\n사칙연산 기호를 제대로 입력해주세요 (+, -, *, /): ");
                input3 = scanner.next();
            }
        }
    }
}

