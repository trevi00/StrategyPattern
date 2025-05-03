package _01_입문._01_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("계산할 두 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("전략을 선택 : 1. 덧셈 2. 뺄셈");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                calculator.setStrategy(new AddStrategy());
                break;
            case 2 :
                calculator.setStrategy(new SubtractStrategy());
                break;
            default :
                System.out.println("잘못된 선택입니다,");
                sc.close();
                return;
        }

        int result = calculator.excute(a, b);
        System.out.println("결과 : " + result);

        sc.close();
    }
}
