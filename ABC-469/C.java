import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char[] arr = str.toCharArray();
        int[] pref = new int[n];
        pref[0] = arr[0] == 'o' ? 1 : 0;
        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1];
            if(arr[i] == 'o')
                pref[i]++;
        }

        for(int k = 1; k <= n; k++){
            int cnt = k;
            int contains = pref[k-1];
            for(int i = k; i < n; i++){
                if(contains == 0)
                    break;

                contains--;
                cnt++;
                if(arr[i] == 'o')
                    contains++;
            }

            System.out.println(cnt);
        }

    }
}