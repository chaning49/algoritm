import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            chess[i] -= n;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(chess[i] + " ");
        }
    }
}