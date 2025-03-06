package calculator.nextlevel;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    // 속성(멤버변수를 등록해라~)
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);

    // 기능
    int add(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    int sub(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    int mul(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    int div(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    int mod(int number1, int number2) {
        int result = number1 % number2;
        return result;
    }

    boolean checkNum(int number1, int number2) {
        if (number1 >= 0 && number2 >= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkStr(String sign) {
        if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

    void addResultList(int result) {
        resultList.add(result);
    }

    ArrayList<Integer> getResultList() {
        return resultList;
    }

    ArrayList<Integer> removeResultList() {
        resultList.remove(0);
        return resultList;
    }

    int calculating(String sign, int number1, int number2) {
        int result = 0;
        switch (sign) {
            case "+":
                result = add(number1, number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "-":
                result = sub(number1, number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "*":
                result = mul(number1, number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case "/":
                while (true) {
                    if (number2 == 0) {
                        System.out.print("분모는 0이 될 수 없습니다. 다시 입력해 주세요: ");
                        number2 = scanner.nextInt();
                    } else {
                        break;
                    }
                }
                result = div(number1, number2);
                int modResult = mod(number1, number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
                System.out.println(number1 + " % " + number2 + " = " + modResult);
                break;
            default:
        }
        return result;
    }
}
