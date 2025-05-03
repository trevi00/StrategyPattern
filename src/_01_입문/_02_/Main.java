package _01_입문._02_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // "Hello World"를 두 전략으로 변환해 출력
        String str = "Hello World";

        TextFormatter textFormatter = new TextFormatter();
        Scanner sc = new Scanner(System.in);

        System.out.println("전략 선택 : 1. 소문자 2. 대문자");
        int selc = sc.nextInt();

        switch (selc){
            case 1 :
                textFormatter.setStrategy(new LowerCaseStrategy());
                break;
            case 2:
                textFormatter.setStrategy(new UpperCaseStrategy());
                break;
            default:
                System.out.println("선택하지 않으셨습니다.");
                sc.close();
                return;
        }
        System.out.println("결과 : " + textFormatter.execute(str));
        sc.close();

    }
}
