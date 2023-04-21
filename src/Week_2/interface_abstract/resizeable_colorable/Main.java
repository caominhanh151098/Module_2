package Week_2.interface_abstract.resizeable_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] mShapes = new Shape[3];

        mShapes[0] = new Circle(5.3);
        mShapes[1] = new Rectangle(3.4, 6.3);
        mShapes[2] = new Square(3);

        for (Shape shape : mShapes) {
            System.out.println(shape);
            ((Resizeable) shape).resize(200);
            System.out.println(shape);
            if(shape instanceof Colorable)
                ((Colorable) shape).howToColor();
        }
    }

}
