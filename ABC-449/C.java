import java.util.*;

class Main {

    static int lowerBound(List<Integer> list, int target) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int upperBound(List<Integer> list, int target) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        String str = sc.next();

        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            map.putIfAbsent(ch, new ArrayList<Integer>());
            map.get(ch).add(i);
        }

        long count = 0;

        for (List<Integer> list : map.values()) {

            for (int i : list) {

                int left = lowerBound(list, i + l);
                int right = upperBound(list, i + r);

                count += right - left;
            }
        }

        System.out.println(count);
    }
}