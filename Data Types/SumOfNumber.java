import java.util.Scanner;

public class SumOfNumber {
    public static void main(String args [])
    {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two number ");
        a = scan.nextInt();
        b = scan.nextInt();
        c=a+b;
        System.out.println("sum of two no is "+c);
    }
}
