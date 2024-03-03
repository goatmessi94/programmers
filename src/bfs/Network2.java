package bfs;

class Network2 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        // Node visit information initialization
        for(int i = 0; i < computers.length; i++){
            visited[i] = false;
        }

        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, visited, computers);
            }
        }

        return answer;
    }

    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;

        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }


    public static void main(String[] args) {
        Network2 network2 = new Network2();
//        System.out.println(network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
//        System.out.println(network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
        //System.out.println(network.solution(3, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}})); // 1
//         System.out.println(network.solution(3, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1},{0,0,1,1}})); // 2
//        System.out.println(network.solution(4, new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1},{1,0,1,1}})); // 1
//        System.out.println(network.solution(3, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}})); // 1

        System.out.println(network2.solution(3, new int[][]{{1, 0, 1}, {1, 0, 1}, {1, 1, 1}})); // 2

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

    }
}