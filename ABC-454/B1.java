import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(set.contains(num)){
                flag = false;
                continue;
            }
            set.add(num);
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");

        if(set.size() == m)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}