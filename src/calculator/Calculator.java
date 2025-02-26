package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");


//        for (int n = 0; n >= 0; n++) {
        // 숫자 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요(0을 포함한 양의 정수):");
        int number1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요(0을 포함한 양의 정수):");
        int number2 = scanner.nextInt();

        if (number1 < 0 || number2 < 0) {
            System.out.println("0을 포함한 양의 정수가 아닙니다!");
            for (int i = 0; i >= 0; i++) {
                if (number1 < 0 || number2 < 0) {
                    System.out.println("0을 포함한 양의 정수를 입력해주세요");
                    System.out.print("첫 번째 정수를 입력해주세요(0을 포함한 양의 정수):");
                    number1 = scanner.nextInt();
                    System.out.print("두 번째 정수를 입력해주세요(0을 포함한 양의 정수):");
                    number2 = scanner.nextInt();
                }
            }
        }
        System.out.println("현재 입력된 number1의 값은 " + number1 + "입니다");
        System.out.println("현재 입력된 number2의 값은 " + number2 + "입니다");

        // 사칙연산 기호 입력받기
        System.out.print("사칙연산 기호를 입력해주세요 (+, -, *, /)");
        String operation = scanner.next();

        if (!operation.equals("+") || !operation.equals("-") || !operation.equals("*") || !operation.equals("/")) {
            for (int i = 0; i >= 0; i++) {
                System.out.print("입력이 올바르지 않습니다\n사칙연산 기호를 제대로 입력해주세요 (+, -, *, /)");
                operation = scanner.next();
                if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                    switch (operation) {
                        case "+":
                            System.out.println(number1 + " " + operation + " " + number2 + " = " + (number1 + number2));
                            System.out.print("계산기를 종료합니다.");
                            break;
                        case "-":
                            System.out.println(number1 + " " + operation + " " + number2 + " = " + (number1 - number2));
                            System.out.print("계산기를 종료합니다.");
                            break;
                        case "*":
                            System.out.println(number1 + " " + operation + " " + number2 + " = " + (number1 * number2));
                            System.out.print("계산기를 종료합니다.");
                            break;
                        case "/":
                            System.out.println(number1 + " " + operation + " " + number2 + " = " + (number1 / number2));
                            System.out.println("나머지는 " + (number1 % number2) + "입니다.");
                            System.out.print("계산기를 종료합니다.");
                            break;
                        default:
                    }
                    break;
                }
            }
        }
    }
}


//            // 계산기 종료
//            System.out.println("계산기를 종료하려면 'exit'을 입력하세요");
//            String quit = scanner.next();
//
//            if(!quit.equals("exit")){
//                System.out.println("계산을 계속합니다");
//            } else {
//                System.out.println("계산기를 종료합니다");
//            }
//            break;
