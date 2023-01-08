package study;

import java.util.Scanner;

public class InputView {

    private Scanner sc;
    private Baseball bb;

    InputView() {
        sc = new Scanner(System.in);
        bb = new Baseball();
    }

    public String userInput() {
        System.out.print("숫자를 입력해 주세요 : ");
        return String.valueOf(sc.nextInt());
    }

    public void userChoice() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
        int num = sc.nextInt();
        if(num == 1) {
            userInput();
        }
        return;
    }
}
