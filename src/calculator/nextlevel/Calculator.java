package calculator.nextlevel;

import java.util.Scanner;

public class Calculator {
    // 속성
    private static int number1;
    private static int number2;
    private int result;
//    private final int result;

    // 생성자
    Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    // 기능
    Scanner scanner = new Scanner(System.in);

    // 모든 기능을 operator로 묶어서 해볼까..?
//    int operator(int input1, int input2) {
//        for (int i = 1; i > 0; i++) {
//            if (input1 < 0 || input2 < 0) {
//                System.out.println("0을 포함한 양의 정수만 입력해주세요. ");
//                System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
//                input1 = scanner.nextInt();
//                System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
//                input2 = scanner.nextInt();
//            }
//        }
//        // 사칙연산 입력
//        System.out.print("사칙연산 기호를 입력해주세요 (+, -, *, /): ");
//        String input3 = scanner.next();
//        for (int i = 1; i > 0; i++) {
//            if (input3.equals("+") || input3.equals("-") || input3.equals("*") || input3.equals("/")) {
//                switch (input3) {
//                    case "+":
//                        result = number1 + number2;
////                        System.out.println("덧셈의 결과는 " + result + "입니다.");
//                        break;
//                    case "-":
//                        result = number1 - number2;
////                        System.out.println("뺄셈의 결과는 " + result + "입니다.");
//                        break;
//                    case "*":
//                        result = number1 * number2;
////                        System.out.println("곱셈의 결과는 " + result + "입니다.");
//                        break;
//                    case "/":
//                        if (number2 == 0) {
////                            System.out.println("분모가 0이면 나눗셈이 불가능합니다.");
//                        } else {
//                            result = number1 / number2;

    /// /                            int result = number1 % number2;
    /// /                            System.out.println("나눗셈의 결과는 " + result + "이고, 나머지는 " + result + "입니다.");
//                        }
//                        break;
//                    default:
//                }
//                break;
//            } else {
//                System.out.print("잘못 입력하였습니다\n사칙연산 기호를 제대로 입력해주세요 (+, -, *, /): ");
//                input3 = scanner.next();
//            }
//        }
//        return result;
//    }


    // 다시 짜보자 괜찮아
    int add(int number1, int number2) {
        this.result = number1 + number2;
        return this.result;
    }

    int sub(int number1, int number2) {
        this.result = number1 - number2;
        return this.result;
    }

    int mul(int number1, int number2) {
        this.result = number1 * number2;
        return this.result;
    }

//    int div(int number1, int number2) {
//        if (number2 == 0) {
//            System.out.print("분모 자리에 0이 올 수 없습니다.");
//            return error;
//        } else {
//            this.result = number1 / number2;
//            return this.result;
//        }
//    }


    // getter
    public int getResult() {
        return result;
    }

    // setter
//    public void setNumber(int number1, int number2) {
//        for (int i = 1; i > 0; i++) {
//            if (number1 >= 0 && number2 >= 0) {
//                this.number1 = number1;
//                this.number2 = number2;
//            } else {
//                System.out.print("잘못 입력하였습니다.\n0을 포함한 양의 정수를 입력해주세요!");
//
//            }
//        }
    public static void setNumber() {
//        Calculator calculator = new Calculator(number1, number2);
        System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
        int number1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
        int number2 = scanner.nextInt();
        Calculator calculator = new Calculator(number1, number2);
        calculator.setNumber();
        for (int i = 1; i > 0; i++) {
            if (number1 < 0 || number2 < 0) {
                System.out.println("잘못 입력하였습니다.\n0을 포함한 양의 정수만 입력해주세요. ");
                System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
                number1 = scanner.nextInt();
                System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
                number2 = scanner.nextInt();
            }
        }
        this.number1 = number1;
        this.number2 = number2;
    }


}

// return 받아야 하면 void 지워야하고 흐ㅡㅁ...

// 잠깐만.. setter에서 조건을 걸 수 있으면 정수 입력 부분에 만들었던 for문은 죽여도 되는거 아닌가?

// 1. scanner를 Calculator 클래스에 넣고 main에서는 함수 호출만 하고 싶어
// 2. 그러려면 main에서는 객체 생성 없이 함수를 호출해야해
//   -> 객체 생성 없이 클래스명으로 호출하려면 static 변수가 필요해
// 3. setNumber에도 static 선언해주고 Calculator 클래스의 number 변수에도 static 설정해줬는데 왜 안되지...