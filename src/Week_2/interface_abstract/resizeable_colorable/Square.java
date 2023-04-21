package Week_2.interface_abstract.resizeable_colorable;

public class Square extends Rectangle implements Resizeable, Colorable{
    public Square() {
    }

    public Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side= " + getWidth() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide((getSide() * percent) / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
