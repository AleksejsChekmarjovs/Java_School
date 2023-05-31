package lesson_1_shapes;

public class Rectangle implements Figure {

        int height;
        int width;
        int color;

        public Rectangle(int height, int width) {
                this.height = height;
                this.width = width;
        }

        public void drow(){
            System.out.println("rectangle " + height + " X " + width);
        }

}
