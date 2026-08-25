import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int val1 = a+b;
        int val2 = a-b;
        int val4 = a*b;

        if(val1 == 9 || val2 == 9 || a == 9*b || val4 == 9)
            System.out.println("Nine");
        else
            System.out.println("Nein");
    }
}