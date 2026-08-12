import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        String str = sc.next();

        char[] arr = str.toCharArray();
        int[] pref = new int[m];

        for(int i = 0; i < m; i++){
            if(arr[i] == '.')
                continue;

            int l = Math.max(0, i-d);
            int r = Math.min(m-1, i+d);
            pref[l]++;
            if(r+1 < m)
                pref[r+1]--;
        }

        for(int i = 1; i < m; i++){
            pref[i] += pref[i-1];
        }

        int cnt = 0;
        for(int i = 0; i < m; i++){
            if(pref[i] == 0)
                cnt++;
        }

        System.out.println(cnt);
    }
}