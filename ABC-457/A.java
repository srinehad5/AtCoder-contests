import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(arr[x]);
    }
}