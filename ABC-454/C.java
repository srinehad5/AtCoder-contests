import java.util.*;

class Main{

    public static void dfs(int node, boolean[] vis, List<List<Integer>> adj){
        vis[node] = true;
        for(int i : adj.get(node)){
            if(!vis[i])
                dfs(i, vis, adj);
        }
    }

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

        boolean[] vis = new boolean[n+1];
        dfs(1, vis, adj);

        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(vis[i])
                cnt++;
        }

        System.out.println(cnt);
    }
}