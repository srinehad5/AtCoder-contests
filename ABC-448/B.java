import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m+1];
        for(int i = 1; i <= m; i++)
            c[i] = sc.nextInt();

        int cnt = 0;
        while(n-- > 0){
            int type = sc.nextInt();
            int ub = sc.nextInt();

            if(c[type] >= ub){
                c[type] -= ub;
                cnt += ub;
            }
            else{
                cnt += c[type];
                c[type] = 0;
            }
        }

        System.out.println(cnt);
    }
}