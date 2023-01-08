package study;

import java.util.Scanner;

public class ResultView {

    private Baseball bb;

    ResultView() {
        bb = new Baseball();
    }

    public void result() {
        if(bb.ball == 0 && bb.strike == 0) {
            System.out.println("낫싱!");
            return;
        }
        if(bb.ball != 0) {
            System.out.print(bb.ball + "볼 ");
        }
        if(bb.strike != 0) {
            System.out.println(bb.strike + "스트라이크");
        }
        if(bb.strike == 3) {
            gameEnd();
        }
    }

    public void gameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");

    }
}
