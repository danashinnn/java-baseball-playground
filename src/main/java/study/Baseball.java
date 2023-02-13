package study;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

    public int strike;
    public int ball;
    private Random r;

    Baseball() {
        strike = 0;
        ball = 0;
        r = new Random();
    }

    public String random() {
        String str = "";
        for(int i=0; i<3; i++) {
            str += r.nextInt(8) + 1;
            for(int j=0; j<i; j++) {
                if(str.charAt(j) == str.charAt(i)) {
                    i--;
                }
            }
        }
        return str;
    }

    public char[] stringToArr(String str) {
        return str.toCharArray();
    }

    public int searchIndex(char ch, String str) {
        return str.indexOf(ch);
    }

    public int checkEqual(int i, int idx) {
        if(idx == -1) {
            return 0;
        }
        if(idx == i) {
            return 1;
        }
        return 2;
    }

}
