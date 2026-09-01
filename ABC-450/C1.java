import java.util.*;

class Main {

    static class Pair {
        int r, c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void bfs(int i, int j, boolean[][] vis,
                           int[][] mat, int[] dr, int[] dc,
                           int n, int m) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(i, j));
        vis[i][j] = true;

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int r = curr.r;
            int c = curr.c;

            for (int k = 0; k < 4; k++) {

                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < m &&
                        !vis[nr][nc] &&
                        mat[nr][nc] == 0) {

                    vis[nr][nc] = true;
                    q.add(new Pair(nr, nc));
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '#')
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        boolean[][] vis = new boolean[n][m];

        // Top and bottom borders
        for (int j = 0; j < m; j++) {

            if (!vis[0][j] && mat[0][j] == 0)
                bfs(0, j, vis, mat, dr, dc, n, m);

            if (!vis[n - 1][j] && mat[n - 1][j] == 0)
                bfs(n - 1, j, vis, mat, dr, dc, n, m);
        }

        // Left and right borders
        for (int i = 0; i < n; i++) {

            if (!vis[i][0] && mat[i][0] == 0)
                bfs(i, 0, vis, mat, dr, dc, n, m);

            if (!vis[i][m - 1] && mat[i][m - 1] == 0)
                bfs(i, m - 1, vis, mat, dr, dc, n, m);
        }

        int cnt = 0;

        // Count enclosed components
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0 && !vis[i][j]) {
                    cnt++;
                    bfs(i, j, vis, mat, dr, dc, n, m);
                }
            }
        }

        System.out.println(cnt);
    }
}