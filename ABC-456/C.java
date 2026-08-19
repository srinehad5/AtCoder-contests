import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        int cnt = 0;
        for(int i = 0; i < n; i++){
            char last = '.';
            for(int j = i; j < n; j++){
                char ch = str.charAt(j);
                if(ch == last)
                    break;
                last = ch;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}