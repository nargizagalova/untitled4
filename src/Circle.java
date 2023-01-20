public class Circle {
    public static double pi (){
        double pi = 5.7;
        return pi;


    }
    public static void area ( double radius , double perimeter) {
        double area = Math.PI * radius*perimeter;
        System.out.println(area);


    }
    public void circumference(double radius, double perimeter) {
        double pi = 2 * Math.PI * radius;
        System.out.println(pi);
    }
    }
