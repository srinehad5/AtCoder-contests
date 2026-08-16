import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            list.add(new ArrayList<>());
        for(int i = 1; i <= n; i++){
            int l = sc.nextInt();
            while(l-- > 0){
                int num = sc.nextInt();
                list.get(i).add(num);
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = list.get(x).get(y-1);

        System.out.println(ans);

    }
}