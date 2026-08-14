import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x * 9 == y * 16)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}