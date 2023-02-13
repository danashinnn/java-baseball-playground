package study;

import java.util.Scanner;

public class InputView {

    private Scanner sc;
    private Baseball bb;
    private ResultView rv;

    InputView() {
        sc = new Scanner(System.in);
        bb = new Baseball();
        rv = new ResultView();
    }

    public String userInput() {
        System.out.print("숫자를 입력해 주세요 : ");
        return String.valueOf(sc.nextInt());
    }

    public void userChoice() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
        int num = sc.nextInt();
        if(num == 1) {
            gameStart();
        }
        return;
    }

    public static void main(String[] args) {
        InputView iv = new InputView();
        iv.gameStart();
    }

    public void gameStart() {
        String answer = bb.random();
        while(true) {
            char[] arr = bb.stringToArr(userInput());
            int strike = 0;
            int ball = 0;
            for (int i = 0; i < 3; i++) {
                int num = bb.checkEqual(i, bb.searchIndex(arr[i], answer));
                if(num == 1) strike++;
                if(num == 2) ball++;
            }
            rv.result(ball, strike);
            if(strike == 3) break;
        }
        userChoice();
    }
}
