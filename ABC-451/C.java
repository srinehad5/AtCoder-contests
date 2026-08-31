import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long total = 0L;
        while(q-- > 0){
            int type = sc.nextInt();
            int h = sc.nextInt();

            if(type == 1){
                map.put(h, map.getOrDefault(h, 0) + 1);
                total++;
            }
            else{
                while (!map.isEmpty() && map.firstKey() <= h) {
                    total -= map.get(map.firstKey());
                    map.pollFirstEntry();
                }
            }
            System.out.println(total);
        }
    }
}