package lesson_1_shapes;

public class Circle implements Figure {
    int height;
    int width;
    int color;

    public Circle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void drow(){
        System.out.println("circle " + height + " X " + width);
}
    }

