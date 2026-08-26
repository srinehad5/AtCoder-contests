import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == 'A')
                sb.append(ch);
            else
                sb.append('.');
        }

        System.out.println(sb);
    }
}
