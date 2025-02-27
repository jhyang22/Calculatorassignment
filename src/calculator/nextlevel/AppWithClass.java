package calculator.nextlevel;

import java.util.Scanner;

public class AppWithClass {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");

        for (int i = 1; i > 0; i++) {
            // 입력
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
            int input1 = scanner.nextInt();
            System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
            int input2 = scanner.nextInt();
            Calculator calculator = new Calculator(input1, input2);

            // 계산
            calculator.operator(input1, input2);

            System.out.print("계산을 계속하시겠습니까? (y/n): ");
            String answer = scanner.next();
            for (int j = 1; j > 0; j++) {
                if (answer.equals("y")) {
                    System.out.println("계산을 계속합니다.");
                    break;
                } else if (!(answer.equals("n") || answer.equals("exit"))) {
                    System.out.println("잘못 입력하였습니다.\n계산을 계속하시겠습니까? (y/n): ");
                    answer = scanner.next();
                } else {
                    break;
                }
            }
            if (answer.equals("n") || answer.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}

// 연산 결과 -> Calculator 클래스의 연산 결과를 저장하는 필드에 저장 --> return을 원하는건가?
// 소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야 한다

// 캡슐화 - getter, setter


// 먼저 숫자 입력 두번
// 사칙연산 기호 입력
// 음수, 나눗셈 시 분모가 0, 사칙연산 기호 잘못 입력 했을 경우 다시 입력 기능

