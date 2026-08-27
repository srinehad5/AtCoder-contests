import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Long> list = new ArrayList<>();
        for(int num : map.keySet()){
            int freq = map.get(num);
            long contribution = (long)num * freq;
            list.add(contribution);
        }

        Collections.sort(list);
        long sum = 0;
        for(int i = 0; i < map.size()-k; i++)
            sum += list.get(i);

        System.out.println(sum);

    }
}