package calculator.nextlevel;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    // 속성
    private int number1;
    private int number2;
    private String sign;
    private int result;
    private int modResult;
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);

    // 생성자
    Calculator() {
        this.number1 = number1;
        this.number2 = number2;

    }

    // 기능
    int add(int number1, int number2) {
        result = this.number1 + this.number2;
        return result;
    }

    int sub(int number1, int number2) {
        result = this.number1 - this.number2;
        return result;
    }

    int mul(int number1, int number2) {
        result = this.number1 * this.number2;
        return result;
    }

    int div(int number1, int number2) {
        result = this.number1 / this.number2;
        return result;
    }

    int mod(int number1, int number2) {
        result = this.number1 % this.number2;
        return result;
    }

    void setInputNum(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    boolean checkNum() {
        if (number1 >= 0 && number2 >= 0) {
            return true;
        } else {
            return false;
        }
    }

    void setInputSign(String sign) {
        this.sign = sign;
    }

    boolean checkStr() {
        if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

    int getResult() {
        return result;
    }

    void setResult(int result) {
        this.result = result;
    }

    ArrayList<Integer> setResultList() {
        resultList.add(result);
        return resultList;
    }

    ArrayList<Integer> getResultList() {
        return resultList;
    }

    ArrayList<Integer> removeResultList() {
        resultList.remove(0);
        return resultList;
    }

}
