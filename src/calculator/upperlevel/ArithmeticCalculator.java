package calculator.upperlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticCalculator<T> {
    // 속성
    private ArrayList<T> resultList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // 기능
    double add(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    double sub(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    double mul(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    double div(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

    boolean checkStr(String sign) {
        if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

    void addResultList(T result) {
        resultList.add(result);
    }

    ArrayList<T> getResultList() {
        return resultList;
    }

    ArrayList<T> removeResultList() {
        resultList.remove(0);
        return resultList;
    }

    double calculate(String sign, double number1, double number2) {
        double result = 0;
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
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
        }
        return result;
    }
}


