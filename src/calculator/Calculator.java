package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");
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
            System.out.println("현재 입력된 number1의 값은 " + number1 + "입니다");
            System.out.println("현재 입력된 number2의 값은 " + number2 + "입니다");
        }
    }
}
