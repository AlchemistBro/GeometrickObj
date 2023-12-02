import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        abstrGeometr[] geometrs =new abstrGeometr[]{new Triangle(3,4,5),new Circle(3),new Rectangle(5,4)};
        Arrays.sort(geometrs);
        System.out.println(Arrays.toString(geometrs));
        geometrs[0].getScale(10);
        Arrays.sort(geometrs);
        System.out.println(Arrays.toString(geometrs));
    }
}
