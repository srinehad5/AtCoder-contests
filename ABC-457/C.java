import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++)
            list.add(new ArrayList<>());

        for(int i = 1; i <= n; i++){
            List<Integer> li = list.get(i);
            int l = sc.nextInt();
            while(l-- > 0){
                int num = sc.nextInt();
                li.add(num);
            }
        }
        List<Integer> c = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            c.add(num);
        }

        long passed = 0;
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int freq = c.get(i-1);
            List<Integer> li = list.get(i);
            long blocksize = (long)freq * li.size();
            if(k <= passed + blocksize){
                int position = (int)((k-passed-1) % li.size());
                ans = li.get(position);
                break;
            }
            passed += blocksize;
        }

        System.out.println(ans);
    }
}