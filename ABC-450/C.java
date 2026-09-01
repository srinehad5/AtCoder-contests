import java.util.*;

class Main{

    public static void dfs(int i, int j, boolean[][] vis, int[][] mat, int[] dr, int[] dc, int n, int m){
        vis[i][j] = true;
        for(int k = 0; k < 4; k++){
            int nr = i + dr[k];
            int nc = j + dc[k];
            if(nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && mat[nr][nc] == 0)
                dfs(nr, nc, vis, mat, dr, dc, n, m);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                char ch = sc.next().charAt(0);
                if(ch == '#')
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        boolean[][] vis = new boolean[n][m];
        for(int j = 0; j < m; j++){
            if(!vis[0][j] && mat[0][j] == 0)
                dfs(0, j, vis, mat, dr, dc, n, m);
            if(!vis[n-1][j] && mat[n-1][j] == 0)
                dfs(n-1, j, vis, mat, dr, dc, n, m);
        }
        for(int i = 0; i < n; i++){
            if(!vis[i][0] && mat[i][0] == 0)
                dfs(i, 0, vis, mat, dr, dc, n, m);
            if(!vis[i][m-1] && mat[i][m-1] == 0)
                dfs(i, m-1, vis, mat, dr, dc, n, m);
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0 && !vis[i][j]){
                    cnt++;
                    dfs(i, j, vis, mat, dr, dc, n, m);
                }
            }
        }

        System.out.println(cnt);
    }
}