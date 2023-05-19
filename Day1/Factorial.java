import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial :");
        int num = in.nextInt();
        System.out.println("The factorial of "+num+" is "+ fact(num));

    }

    public static int fact(int num)
    {
        if(num==1 || num==0)
        {
            return num;
        }
        return fact(num-1) * num ;
    }
}
