import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] curr = new int[m+1];
        int[] next = new int[m+1];

        while(n-- > 0){
            int first = sc.nextInt();
            int second = sc.nextInt();

            curr[first]++;
            next[second]++;
        }

        for(int i = 1; i <= m; i++){
            System.out.println(next[i]-curr[i]);
        }
    }
}