import java.util.*;

class Main{

    static class Pair{
        int time, value;
        Pair(int time, int value){
            this.time = time;
            this.value = value;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[t+1];
        for(int i = 0; i <= t; i++)
            arr[i] = sc.nextInt();

        List<Pair> list = new ArrayList<>();
        int last = arr[0];
        list.add(new Pair(0, arr[0]));
        for(int i = 1; i <= t; i++){
            int diff = Math.abs(arr[i]-last);
            if(diff >= x){
                last = arr[i];
                list.add(new Pair(i, arr[i]));
            }
        }

        for(Pair p : list){
            System.out.print(p.time + " ");
            System.out.println(p.value);
        }
    }
}