public class Rectangle extends abstrGeometr{
    double width,lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
        square=getSquare();
    }

    @Override
    double getSquare() {
        return width*lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square +
                '}';
    }

    @Override
    void getScale(double scale) {
        width*=scale;
        lenght*=scale;
        square=getSquare();
    }
}
