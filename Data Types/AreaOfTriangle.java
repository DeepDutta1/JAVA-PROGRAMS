import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String arg[]){
        int a,b,c,s;
        float area;
        System.out.println("Enter the length of triangle ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        s = (int) ((a+b+c)/2f);
        area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of triangle is "+area);
        
    }
}
