import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][2];
        for(int i = 0; i < n; i++){
            mat[i][0] = sc.nextInt();
            mat[i][1] = sc.nextInt();
        }

        Arrays.sort(mat, (a, b) -> {
            if(a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int cnt = 1;
        int minY = mat[0][1];
        for(int i = 1; i < n; i++){
            int y = mat[i][1];

            if(y < minY)
                cnt++;
            minY = Math.min(minY, y);
        }

        System.out.println(cnt);
    }
}