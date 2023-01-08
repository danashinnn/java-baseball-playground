package study;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

    private String answer;
    private int strike;
    private int ball;
    private Random r;

    Baseball() {
        answer = "";
        strike = 0;
        ball = 0;
        r = new Random();
    }

    public String random() {
        for(int i=0; i<3; i++) {
            answer += r.nextInt(8) + 1;
        }
        return answer;
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
}
