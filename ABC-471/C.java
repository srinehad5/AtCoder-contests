import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr[n] = 0;

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        for(int i = 0; i <= n; i++){
            if(arr[i] == 0)
                idx = i;
            list.add(arr[i]);
        }

        long totaldist = 0;
        int curr = idx;
        while(list.size() > 1){
            idx = curr;
            int ld = Integer.MAX_VALUE;
            if(idx-1 >= 0)
                ld = list.get(idx) - list.get(idx-1);
            int rd = Integer.MAX_VALUE;
            if(idx+1 < list.size())
                rd = list.get(idx+1) - list.get(idx);

            if(ld <= rd){
                totaldist += ld;
                curr = idx-1;
                list.remove(idx);
            }
            else{
                totaldist += rd;
                curr = idx;
                list.remove(idx);
            }
        }

        System.out.println(totaldist);
    }
}