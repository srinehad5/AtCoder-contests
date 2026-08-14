import java.util.*;

class Main{

    public static int ceil(int x, int[] arr){

        int n = arr.length;
        int ans = -1;
        int l = 0, h = n-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] > x){
                ans = mid;
                h=mid-1;
            }
            else
                l=mid+1;
        }

        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int leave = sc.nextInt();
            h[i] = height;
            l[i] = leave;
        }
        int[] suffixmax = new int[n];
        suffixmax[n-1] = h[n-1];
        for(int i = n-2; i >= 0; i--){
            suffixmax[i] = Math.max(h[i], suffixmax[i+1]);
        }

        int q = sc.nextInt();
        while(q-- > 0){
            int t = sc.nextInt();

            int idx = ceil(t, l);
            System.out.println(suffixmax[idx]);
        }
    }
}