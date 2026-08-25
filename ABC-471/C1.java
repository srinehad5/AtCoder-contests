import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int l = -1, r = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                r = i;
                break;
            }
        }
        if(r == -1)
            r = n;
        l = r-1;

        long totaldist = 0;
        int curr = 0;
        while(l >= 0 || r < n){

            int ld = Integer.MAX_VALUE;
            if(l >= 0)
                ld = curr - arr[l];
            int rd = Integer.MAX_VALUE;
            if(r < n)
                rd = arr[r] - curr;

            if(ld <= rd){
                totaldist += ld;
                curr = arr[l];
                l--;
            }
            else{
                totaldist += rd;
                curr = arr[r];
                r++;
            }
        }

        System.out.println(totaldist);
    }
}