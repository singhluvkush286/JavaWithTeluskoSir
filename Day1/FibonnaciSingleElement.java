import java.util.*;
public class FibonnaciSingleElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter position of fibonacci Series element to find :");
        int num = input.nextInt();
        System.out.println("The factorial of "+num+" is "+ fib(num));
    }
    public static int fib(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num==1 || num==2)
        {
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }

}
