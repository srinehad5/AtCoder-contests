import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        int ans = 1, len = 1;
        char last = str.charAt(0);
        for(int i = 1; i < n; i++){
            char ch = str.charAt(i);
            if(ch == last)
                len = 1;
            else{
                last = ch;
                len++;
            }
            ans = (ans + len) % 998244353;
        }

        System.out.println(ans);
    }
}