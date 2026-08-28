import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(set.contains(list.get(i))){
                flag = false;
                break;
            }
            set.add(list.get(i));
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");

        flag = true;
        for(int i = 1; i <= m; i++){
            if(!list.contains(i)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}