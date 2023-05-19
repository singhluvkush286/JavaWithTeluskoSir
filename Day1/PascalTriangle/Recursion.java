package PascalTriangle;

import java.util.Scanner;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascal(row - 1, col - 1) + pascal(row - 1, col);
        }
    }
}

//Took guidance of several website portal : )
