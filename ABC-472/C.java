import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long sum = 0;
        boolean[] taken = new boolean[n];
        for(int i = 0; i < m; i++){
            if(sum + arr[i] <= k){
                taken[i] = true;
                sum += arr[i];
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }

        for(int i = m; i < n; i++){
            if(taken[i-m])
                sum -= arr[i-m];

            if(sum + arr[i] <= k){
                sum += arr[i];
                taken[i] = true;
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}