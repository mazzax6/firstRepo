import java.util.Scanner;

public class SquareCalculator {
    public static void main (String[]arg) {

        //scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter width ");
        double width = myObj.nextDouble();

        System.out.println("Enter height ");
        double height = myObj.nextDouble();

        double perimeter = 2 * (width + height);
        double area = width*height;

        System.out.println( "perimeter of the rectangle is : " + perimeter );
        System.out.println( "perimeter of the area is : " + area );

    }
}


// old code:
//import java.util.Scanner;

//public class SquareCalculator {
  //  public static void main (String[]arg) {
//
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter width ");
        //double width = myObj.nextDouble();

        //System.out.println("Enter width ");
      //  double width = myObj.nextDouble();

    //    //double width = 13.5;
  //      //double height = 25.3;
//
    //    double perimeter = 2 * (width + height);
  //      double area = width*height;
//
    //    System.out.println( "perimeter of the rectangle is : " + perimeter );
  //      System.out.println( "perimeter of the area is : " + area );
//
  //  }
//}