import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            ans.add(new ArrayList<>());
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            while(num-- > 0){
                int gifted = sc.nextInt();
                arr[gifted]++;
                ans.get(gifted).add(i);
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
            List<Integer> list = ans.get(i);
            for(int num : list){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}