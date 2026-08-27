import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] mat = new char[h][w];
        for(int i = 0; i < h; i++){
            String str = sc.next();
            mat[i] = str.toCharArray();
        }

        int cnt = 0;
        for(int r1 = 0; r1 < h; r1++){
            for(int r2 = r1; r2 < h; r2++){
                for(int c1 = 0; c1 < w; c1++){
                    for(int c2 = c1; c2 < w; c2++){

                        boolean flag = true;
                        for(int i = r1; i <= r2; i++){
                            for(int j = c1; j <= c2; j++){

                                int opprow = r1 + r2 - i;
                                int oppcol = c1 + c2 -j;
                                if(mat[i][j] != mat[opprow][oppcol]){
                                    flag = false;
                                    break;
                                }
                            }
                            if(!flag)
                                break;
                        }

                        if(flag)
                            cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}