import java.util.*;

class Main{

    static class Pair{
        int idx, val;
        Pair(int idx, int val){
            this.idx = idx;
            this.val = val;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    return Integer.compare(a.val, b.val);
                }
        );
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            pq.add(new Pair(i+1, arr[i]));
        }

        while(q-- > 0){
            int k = sc.nextInt();
            Set<Integer> list = new HashSet<>();
            for(int i = 0; i < k; i++){
                int num = sc.nextInt();
                list.add(num);
            }
            Set<Pair> temp = new HashSet<>();
            while(list.contains(pq.peek().idx)){
                temp.add(pq.poll());
            }
            System.out.println(pq.peek().val);
            for(Pair p : temp)
                pq.add(p);
        }
    }
}