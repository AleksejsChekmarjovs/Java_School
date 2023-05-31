package lesson_1_shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 5);
        Circle circle2 = new Circle(15, 10);
        Square square1 = new Square(10, 15);

        Figure[] figures = new Figure[3];
        figures[0]= square1;
        figures[1] = circle2;
        figures[2] = circle1;
}}