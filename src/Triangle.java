public class Triangle extends abstrGeometr{
    double fSide,sSide,tSide;
    public Triangle(double a,double b,double c) {
        fSide=a;
        sSide=b;
        tSide=c;
        square=getSquare();

    }


    @Override
    double getSquare() {
        return Math.sqrt((fSide+sSide+tSide)/2*((fSide+sSide+tSide)/2-fSide)*((fSide+sSide+tSide)/2-sSide)*((fSide+sSide+tSide)/2-tSide));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                '}';
    }

    @Override
    void getScale(double scale) {
        fSide*=scale;
        sSide*=scale;
        tSide*=scale;
        square=getSquare();
    }
}
