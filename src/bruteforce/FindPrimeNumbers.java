package bruteforce;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * FindPrimeNumbers
 */
public class FindPrimeNumbers {

    Set<Integer> set = new HashSet<>();

    public void recursive(String combo, String others) {
        if (!combo.equals("")) set.add(Integer.valueOf(combo));

        //종료 조건 others.length가 0인경우 콤보는 올라가고 아더스는 줄어들고
        for (int i=0; i<others.length(); i++) recursive(combo + others.charAt(i), others.substring(0, i) + others.substring(i+1));
    }

    public int solution(String numbers) {

        // 1. 재귀함수 이용 dfs 
        recursive("", numbers);

        // 2. HashSet에 저장 
        int count = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if (sosu(it.next())) count += 1;
        }

        // 3. hash set만큼 반복 하여 소수인 항목들만 sum 후 리턴
        int answer = count;
        return answer;
    }

    public boolean sosu(int num) {
        // 0과 1은 소수가 아니다
        if (num == 0 || num == 1) return false;

        // 체 걸러
        int lim = (int) Math.sqrt(num);

        for (int i=2; i<=lim; i++) 
            if (num % i == 0) return false;
        

        return true;
    }

    public static void main(String[] args) {
        FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();
        System.out.println(findPrimeNumbers.solution("023"));
    }
}