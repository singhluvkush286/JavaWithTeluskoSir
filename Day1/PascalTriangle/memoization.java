package PascalTriangle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class memoization {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(pascal(i, j, map) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int row, int col, Map<String,Integer> map)
    {
        String key = row + "-" + col;
        if (col == 0 || col == row)
        {
            return 1;
        }
        else if (map.containsKey(key))
        {
            return map.get(key);
        }
        else
        {
            int value = pascal(row - 1, col - 1, map) + pascal(row - 1, col, map);
            map.put(key, value);
            return value;
        }
    }
}
