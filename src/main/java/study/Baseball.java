package study;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

    private String answer;
    private String userInput;
    public int strike;
    public int ball;
    private Random r;
    private InputView iv;
    private ResultView rv;

    Baseball() {
        answer = "";
        userInput = "";
        strike = 0;
        ball = 0;
        r = new Random();
        iv = new InputView();
        rv = new ResultView();
    }

    public void random() {
        for(int i=0; i<3; i++) {
            answer += r.nextInt(8) + 1;
        }
    }

    public char[] stringToArr(String str) {
        return str.toCharArray();
    }

    public void checkContains(char ch) {
        int idx = answer.indexOf(ch);
        if(idx != -1) {
            checkEqual(ch, idx);
        }
    }

    public void checkEqual(char ch, int idx) {
        if(answer.charAt(idx) == ch) {
            strike++;
        }
        ball++;
    }

    public void gameStart() {
        char[] arr = stringToArr(iv.userInput());
        random();
        for(int i=0; i<3; i++) {
            checkContains(arr[i]);
        }
        rv.result();
        iv.userChoice();
    }
}
