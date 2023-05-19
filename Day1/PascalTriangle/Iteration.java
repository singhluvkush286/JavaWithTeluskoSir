package PascalTriangle;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int row = in.nextInt();

            Pascal(row);
        }

        public static void Pascal(int n) {
            for (int i = 0; i < n; i++) {
                int num = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }

