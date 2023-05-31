package lesson_1_shapes;

public class Square implements Figure{
    int height;
    int width;
    private int color;

    public int getColor() {
        return color;
    }

    public Square(int height, int width) {
        if(height != width) throw new IllegalArgumentException("Height must be = width!");
        this.height = height;
        this.width = width;
    }

    public void drow(){
        System.out.println("square " + height + " X " + width);
    }
}
