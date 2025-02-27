package calculator.nextlevel;

public class Calculator {
    // 속성
    int number1;
    int number2;

    // 생성자
    Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }



    // 기능
    void add(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("덧셈의 결과는 " + result + "입니다.");
    }

    void subtract(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("뺄셈의 결과는 " + result + "입니다.");
    }

    void multiply(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("곱셈의 결과는 " + result + "입니다.");
    }

    void divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("분모가 0이면 나눗셈이 불가능합니다.");
        } else {
            int result = number1 / number2;
            int result1 = number1 % number2;

            System.out.println("나눗셈의 결과는 " + result + "이고, 나머지는 " + result1 + "입니다.");
        }
    }

}
