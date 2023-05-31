package lesson_1_shapes;

public class Elipse implements Figure {
    int height;
    int width;
    int color;

    public Elipse(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void drow(){
        System.out.println("elipse" + height + " X " + width);
}
    }