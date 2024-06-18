import java.util.*;

public class challenge11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Area of Triangle ");
        System.out.print("Enter the Breadth :");
        double breadth = sc.nextDouble();
        System.out.print("Enter the Height :");
        double height = sc.nextDouble();

        double areaoftriangle = 0.5 * breadth*height;
        System.out.println("Area of triangle is :"+ areaoftriangle);
    }
}
