package bruteforce;

import java.util.*;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int garo = 0;
        int saero = 0;

        for (int i=1; i<yellow+1; i++) {
            int temapSaero = yellow/i;
  
            if (temapSaero * i == yellow) {

                if ( brown+yellow == i +2 * temapSaero +2) {
                    garo = i;
                    saero = temapSaero;                
                }
            }

            if ( garo != 0 && garo >= saero) break;
        }

        int[] answer = {garo+2, saero+2};
        return answer;
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        // carpet.solution(24, 24);
        
        System.out.println(carpet.solution(10, 2)[0]);
        System.out.println(carpet.solution(10, 2)[1]);
    }
}
