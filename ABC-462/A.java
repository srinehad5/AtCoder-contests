import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch >= '0' && ch <= '9')
                sb.append(ch);
        }
        String ans = sb.toString();

        System.out.println(ans);
    }
}