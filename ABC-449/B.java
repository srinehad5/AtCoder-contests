import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        while(q-- > 0){
            int type = sc.nextInt();
            if(type == 1){
                int r = sc.nextInt();
                n -= r;
                int cnt = r * m;
                System.out.println(cnt);
            }
            else{
                int c = sc.nextInt();
                m -= c;
                int cnt = c * n;
                System.out.println(cnt);
            }
        }
    }
}