public class Main {

    public static void main (String [] args) {
        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (10, 10, 20);
        System.out.println( circle1.compareTo (circle2));
        if (circle1.compareTo(circle2) < 0) {
            System.out.println("circle1 es menor que circle2");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("circle1 es mayor que circle2");
        } else {
            System.out.println("ambos circulos tienen la misma área");
        }
        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);
        System.out.println(rec1.compareTo(rec2));
        if (rec1.compareTo(rec2) < 0) {
            System.out.println("Rectangle 2 es mayor que Rectangle 1");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("Rectangle 1 es mayor que Rectangle 2");
        } else {
            System.out.println("ambos rectangulos tienen la misma área");
        }

    }

}