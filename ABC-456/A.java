import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] a = {1, 2, 3, 4, 5, 6};

        boolean flag = false;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                for(int k = 0; k < 6; k++){

                    int sum = a[i] + a[j] + a[k];
                    if(sum == x){
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            if(flag)
                break;
        }

        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}