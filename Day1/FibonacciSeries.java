import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term :");
        int num = input.nextInt();
        System.out.println("fibonacci Series :-");
        for (int i = 1; i <= num; i++) {
            System.out.print(fib(i)+"  ");
        }
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
