import java.util.Scanner;

public class RootOfQuadEqua {
    public static void main(String args[])
    {
        int a,b,c;
        double r1,r2,d;
        System.out.println("enter the a, b, c");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = Math.sqrt(b*b-(4*a*c));

        r1 = (-b+d)/(2*a);
        r2 = (-b-d)/(2*a);

        System.out.println("root of the equation is "+ r1 + " & " + -2r2);

    }
}
