public abstract class abstrGeometr implements Comparable<abstrGeometr>{

    public double square;
    abstract double getSquare();

    abstract void getScale(double scale);


    @Override
    public int compareTo(abstrGeometr o) {
        if(this.square>o.square)
            return 1;
        else if (this.square<o.square)
            return -1;
        return 0;

    }
}
