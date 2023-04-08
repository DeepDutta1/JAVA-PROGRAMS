import java.util.Scanner;

public class AreaOfSAS {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        int l,b,h;
        double area;
        System.out.println("enter l,b,h of the cuboid is ");
        Scanner scan = new Scanner(System.in);
        l = (int)scan.nextFloat();
        b = (int)scan.nextFloat();
        h = (int)scan.nextFloat();

        area = 2f*(l*b+b*h+l*h)-l*b;
        System.out.println("Area of the cover tiles portion : "+area);
    }
        
}
