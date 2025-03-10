package calculator.upperlevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppUpper {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        System.out.println(" ");

        ArithmeticCalculator cal = new ArithmeticCalculator();
        Scanner scanner = new Scanner(System.in);

        double number1 = 0;
        double number2 = 0;

        // 실수 입력
        while (true) {
            while (true) {
                try {
                    System.out.print("첫 번째 실수를 입력해주세요: ");
                    number1 = scanner.nextDouble();
                    System.out.print("두 번째 실수를 입력해주세요: ");
                    number2 = scanner.nextDouble();
                    System.out.println("현재 입력된 값은 " + number1 + ", " + number2 + "입니다");
                    break;
                } catch (RuntimeException e) {
                    System.out.println("숫자를 제대로 입력하지 않았습니다!\n다시 입력해주세요!");
                    scanner.nextLine();
                }
            }

            // 사칙연산 기호 입력 - enum 활용...(해결 못함)
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

            // 사칙연산 수행 - 제네릭 사용 (해결 못함)
            double result = cal.calculate(sign, number1, number2);

            // 리스트에 저장
            ArrayList<Double> arrayList = new ArrayList<>();
            cal.addResultList(result);
            arrayList = cal.getResultList();
            System.out.println("현재 저장된 리스트는 = " + arrayList + "입니다.");

            // 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값들을 출력 - 람다, 스트림 활용
            List<Double> comResult = arrayList.stream()
                    .filter(b -> result < b)
                    .collect(Collectors.toList());
            System.out.println("현재 결과는 " + result + "이고 " + result + "보다 큰 저장된 결과값들은 " + comResult + "입니다.");

            // 리스트 삭제
            System.out.println("현재 저장된 리스트는 = " + arrayList + "입니다.");
            System.out.print("인덱스를 삭제하시겠습니까? (y/n): ");
            String indexAnswer = scanner.next();
            while (true) {
                if (indexAnswer.equals("y")) {
                    try {
                        System.out.println("현재 저장된 리스트는 = " + arrayList + "입니다.");
                        System.out.print("삭제할 인덱스를 선택하세요 (최대 입력 가능한 수 : " + (arrayList.toArray().length - 1) + "): ");
                        int number3 = scanner.nextInt();
                        cal.removeResultList(number3);
                        System.out.println("삭제 후 현재 저장된 리스트는 = " + arrayList + "입니다.");
                        break;
                    } catch (RuntimeException e) {
                        System.out.println("숫자를 제대로 입력하지 않았습니다!\n다시 입력해주세요!");
                        scanner.nextLine();
                    }
                } else if (indexAnswer.equals("n")) {
                    break;
                } else {
                    System.out.print("입력이 올바르지 않습니다. 다시 입력해주세요. (y/n) ");
                    indexAnswer = scanner.next();
                }
            }

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

//    public enum OperatorType {
//        ADD("+"), SUB("-"), MUL("*"), DIV("/")
//
//        private String type;
//
//        OperatorType(String type) {
//            this.type = type;
//        }
//
//        public String getType() {
//            return type;
//        }
//    }
