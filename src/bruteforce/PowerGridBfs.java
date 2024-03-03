package bruteforce;

import java.util.LinkedList;
import java.util.Queue;

/*
https://arinnh.tistory.com/84
 */

class PowerGridBfs {
    static int[][] graph;

    public int solution(int n, int[][] wires) {
        int answer = n;
        graph = new int[n+1][n+1];

        for(int i=0; i<wires.length; i++){
            int from = wires[i][0], to = wires[i][1];
            graph[from][to] = 1;
            graph[to][from] = 1;
        }

//
        for (int i=1; i<wires.length; i++) {
            for (int j=1; j<graph[i].length; j++) {
                System.out.print("graph["+ i + "]["+ j +"]번째의  = " + graph[i][j] +" ");
            }
            System.out.println();

        }
// [[1,3]

        for(int i=0; i<wires.length; i++){
            int from = wires[i][0], to = wires[i][1];
            graph[from][to] = 0;
            graph[to][from] = 0;

            answer = Math.min(answer, bfs(n, 4));
            graph[from][to] = 1;
            graph[to][from] = 1;

        }
        return answer;
    }

    public static int bfs(int n, int x){
        boolean[] visited = new boolean[n+1];
        int count = 1;

        //[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]

        Queue<Integer> que = new LinkedList<Integer>();
        visited[x] = true;
        que.offer(x); // 큐에 추가

        while(!que.isEmpty()){ // 큐가 비어 있지 않을 때까지 반복, 비어 있으면 멈춤
            int temp = que.poll(); //큐에서 빼버림

            for(int i=1; i<=n; i++){ // 그냥 연결되어 있는 만큼 count에 더하는 거
                if(graph[temp][i] == 1 && !visited[i]){
                    System.out.println("연결된 노드" + temp);
                    visited[i] = true;
                    que.offer(i); //큐에 추가
                    count ++;
                }
            }
        }

        return (int) Math.abs(count-(n-count)); // 총 연결되 있는거에서 이어저 있는 것만큼 빼면 결과 값임
    }


    public static void main(String[] args) {
        PowerGridBfs powerGridBfs = new PowerGridBfs();
        powerGridBfs.solution(9, new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}});
    }
}