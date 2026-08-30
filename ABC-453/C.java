import java.util.*;

class Main{

    static int cnt = 0;

    public static void func(double curr, int idx, int crosses, int[] arr){
        if(idx == arr.length){
            cnt = Math.max(cnt, crosses);
            return;
        }

        if(curr > 0){
            double ld = curr-arr[idx];
            if(ld < 0)
                func(curr-arr[idx], idx+1, crosses+1, arr);
            else
                func(curr-arr[idx], idx+1, crosses, arr);

            func(curr+arr[idx], idx+1, crosses, arr);
        }
        else{
            func(curr-arr[idx], idx+1, crosses, arr);

            double rd = curr+arr[idx];
            if(rd > 0)
                func(curr+arr[idx], idx+1, crosses+1, arr);
            else
                func(curr+arr[idx], idx+1, crosses, arr);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        func(0.5, 0, 0, arr);

        System.out.println(cnt);
    }
}