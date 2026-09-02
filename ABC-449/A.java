import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double r = d/2.0;

        double ans = 3.141592653589793 * r * r;
        System.out.println(ans);
    }
}