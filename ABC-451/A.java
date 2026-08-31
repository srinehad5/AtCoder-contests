import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.length() % 5 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}