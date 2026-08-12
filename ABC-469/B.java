import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char[] arr = str.toCharArray();

        int cnt = 0;
        for(int i = 0; i < n; i++){

            if(arr[i] == 'o')
                continue;

            char left = i > 0 ? arr[i-1] : 'x';
            char right = i < n-1 ? arr[i+1] : 'x';

            if(left == 'x' && right == 'x')
                cnt++;
        }

        System.out.println(cnt);
    }
}