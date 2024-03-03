package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Network {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];

        int count = 0;
        for (int i=0; i<n; i++) {
            int tempCont = 0;
            for (int j=0; j<visited.length; j++) {
                if (visited[j] == false) {
                    count++;
                    break;
                }
            }
//             if (bfs(i, computers)) {
//
//             }
        }


        int answer = count;
        return answer;
    }

    public int bfs(int nodeIndex, int[][] computers) {
        visited[nodeIndex] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(nodeIndex);

        int nextNode = 0;

        while (!queue.isEmpty()) { //비어 있지 않는 동안 실행, 비어있으면 멈춤
            int n = queue.poll();
            nextNode = n;
            for (int i=0; i<computers.length; i++) {
                if (computers[n][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }

        // 패스 시키기 똑같다면
        return nextNode;
    }

    public static void main(String[] args) {
        Network network = new Network();
//        System.out.println(network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
//        System.out.println(network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
        //System.out.println(network.solution(3, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}})); // 1
//         System.out.println(network.solution(3, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1},{0,0,1,1}})); // 2
//        System.out.println(network.solution(4, new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1},{1,0,1,1}})); // 1
//        System.out.println(network.solution(3, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}})); // 1

        //	[[1, 0, 1], [1, 0, 1], [1, 1, 1]] //2

//        System.out.println(network.solution(3, new int[][]{{1, 0, 1}, {1, 0, 1}, {1, 1, 1}})); // 2


//        System.out.println(network.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));


//        System.out.println(network.solution(7, new int[][]{
//                {1,0,0,0,0,0,1},
//                {0,1,1,0,1,0,0},
//                {0,1,1,1,0,0,0},
//                {0,0,1,1,0,0,0},
//                {0,1,0,0,1,1,0},
//                {0,0,0,0,1,1,1},
//                {1,0,0,0,0,1,1}
//        })); // 1
        // 3, [[1, 1, 1], [1, 1, 0], [1, 0, 1]]


        System.out.println( network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}) );// 기댓값 〉 2

        System.out.println(network.solution( 3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})) ;//기댓값 〉 1

        System.out.println( network.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}})) ;//기댓값 〉 4

        System.out.println(network.solution( 4, new int[][]{{1, 1, 0, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 0, 1, 1}})); //기댓값 〉 1

        System.out.println(network.solution( 3,new int[][] {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}} )) ; //기댓값 〉 2

        System.out.println(network.solution( 3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}} )) ;//기댓값 〉 1

        System.out.println(network.solution( 3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}} )); //기댓값 〉 2

        System.out.println( network.solution(4, new int[][] {{1, 1, 0, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 0, 1, 1}})) ;//기댓값 〉 1

        System.out.println(network.solution( 7, new int[][]{{1, 0, 0, 0, 0, 0, 1}, {0, 1, 1, 0, 1, 0, 0}, {0, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0}, {0, 0, 0, 0, 1, 1, 1}, {1, 0, 0, 0, 0, 1, 1}} )) ;//기댓값 〉 1


    }
}
