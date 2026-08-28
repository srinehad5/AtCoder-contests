import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }

        Queue<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[n+1];
        q.add(1);
        vis[1] = true;

        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;
            for(int i : adj.get(node)){
                if(!vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }

        System.out.println(cnt);
    }
}