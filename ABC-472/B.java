import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1; i < n; i++)
            pref[i] = pref[i-1] + arr[i];
        int[] suff = new int[n];
        suff[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--)
            suff[i] = arr[i] + suff[i+1];

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            int ls = pref[i];
            int rs = suff[i+1];
            int diff = Math.abs(ls-rs);
            ans = Math.min(ans, diff);
        }

        System.out.println(ans);
    }
}