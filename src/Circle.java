public class Circle extends abstrGeometr{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        square=getSquare();
    }

    @Override
    double getSquare() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "square=" + square +
                '}';
    }

    @Override
    void getScale(double scale) {
        radius*=scale;
        scale=getSquare();
    }
}
