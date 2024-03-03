package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  MockExam
 */
public class  MockExam {
    public static int[] solution(int[] answers) {

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] correct = new int[3];
        int maxTemp = 0;
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == one[i%5]) correct[0] += 1;
            if (answers[i] == two[i%8]) correct[1] += 1;
            if (answers[i] == three[i%10]) correct[2] += 1;
        }

        maxTemp = Math.max(correct[0], Math.max(correct[1], correct[2]));

        List<Integer> answerList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            if (maxTemp == correct[i]) answerList.add(i+1);
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
    
    public static void main(String args[]) {
        int[] input = {1,2,3,4,5};
        System.out.println(solution(input));
    }
}