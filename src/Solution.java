import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int count = 0;
        int size = set.size();

        for (Integer num : set) {
            System.out.print(num);
            count++;
            if (count < size) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}