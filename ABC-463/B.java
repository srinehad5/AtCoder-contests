import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char x = sc.next().charAt(0);
        String cols = "ABCDE";
        int col = cols.indexOf(x);

        boolean flag = false;
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.charAt(col) == 'o'){
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}