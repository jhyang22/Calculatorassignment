package calculator.nextlevel;

import java.util.Scanner;

public class AppWithClass {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 (0을 포함): ");
        int input1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 (0을 포함): ");
        int input2 = scanner.nextInt();

        Calculator calculator = new Calculator(input1, input2);
        calculator.add(input1, input2);
        calculator.subtract(input1, input2);
        calculator.multiply(input1, input2);
        calculator.divide(input1, input2);


    }
}

