import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int cost = sc.nextInt();
                mat[i][j] = cost;
            }
        }

        boolean flag = false;
        for(int a = 0; a < n; a++){
            for(int b = a+1; b < n; b++){
                for(int c = b+1; c < n; c++){
                    int sum = mat[a][b] + mat[b][c];
                    if(sum < mat[a][c]){
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            if(flag)
                break;
        }

        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}