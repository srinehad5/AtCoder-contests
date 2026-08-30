import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!flag && ch == 'o')
                continue;
            else{
                flag = true;
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}