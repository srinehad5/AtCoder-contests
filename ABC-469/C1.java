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

            int l = k, h = n-1;
            int ans = k-1;
            while(l <= h){
                int mid = (l+h)/2;

                int o_count = (mid == k) ? 0 : pref[mid - 1] - pref[k - 1];
                int total_count = mid-k;
                int xs = total_count - o_count;

                if(xs < contains){
                    ans = mid;
                    l=mid+1;
                }
                else
                    h=mid-1;
            }
            System.out.println(ans+1);
        }
    }
}