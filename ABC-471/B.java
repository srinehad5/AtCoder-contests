import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            str = str.toLowerCase();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int max = 0;
        for(String str : map.keySet()){
            int freq = map.get(str);
            max = Math.max(max, freq);
        }

        System.out.println(max);


    }
}