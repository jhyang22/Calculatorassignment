package calculator.nextlevel;

import java.util.Scanner;
import java.util.ArrayList;

public class AppWithClass {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");

        Calculator cal = new Calculator();

        while (true) {
            // 정수 입력
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
            int number1 = scanner.nextInt();
            System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
            int number2 = scanner.nextInt();

            // 입력 정수 확인
            while (true) {
                boolean checkNum = cal.checkNum(number1, number2);
                if (checkNum) {
                    break;
                } else {
                    System.out.println("0을 포함한 양의 정수가 아닙니다! 0을 포함한 양의 정수를 입력해주세요");
                    System.out.print("첫 번째 정수를 다시 입력해주세요(0을 포함한 양의 정수): ");
                    number1 = scanner.nextInt();
                    System.out.print("두 번째 정수를 다시 입력해주세요(0을 포함한 양의 정수): ");
                    number2 = scanner.nextInt();
                }
            }
            System.out.println("현재 입력된 값은 " + number1 + ", " + number2 + "입니다");

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력해주세요 (+, -, *, /): ");
            String sign = scanner.next();

            // 입력받은 기호 확인
            while (true) {
                boolean checkStr = cal.checkStr(sign);
                if (checkStr) {
                    break;
                } else {
                    System.out.print("입력이 올바르지 않습니다\n사칙연산 기호를 제대로 입력해주세요 (+, -, *, /): ");
                    sign = scanner.next();
                }
            }

            // 사칙연산 수행
            int result = cal.calculating(sign, number1, number2);

            // 리스트에 저장하기
            ArrayList<Integer> arrayList = new ArrayList<>();

            cal.addResultList(result);
            arrayList = cal.getResultList();
            System.out.println("현재 저장된 리스트는 = " + arrayList + "입니다.");

            cal.removeResultList();
            System.out.println("현재 저장된 리스트는 = " + arrayList + "입니다.");

            // 계산기 종료
            System.out.print("계산을 계속하시겠습니까? (y/n) ");
            String answer = scanner.next();
            while (true) {
                if (answer.equals("y") || answer.equals("n") || answer.equals("exit")) {
                    break;
                } else {
                    System.out.print("입력이 올바르지 않습니다. 다시 입력해주세요. (y/n) ");
                    answer = scanner.next();
                }
            }

            if (answer.equals("n") || answer.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (answer.equals("y")) {
                System.out.println("계산을 계속합니다.");
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

