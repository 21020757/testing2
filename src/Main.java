import java.util.Scanner;

public class Main {


    public static double findMin(double a, double b, double c) {
        double min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;

    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double a, b, c;
//        a = scanner.nextDouble();
//        b = scanner.nextDouble();
//        c = scanner.nextDouble();
//
//        System.out.println(findMin(a, b, c));
//    }
}