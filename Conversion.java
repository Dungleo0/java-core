public class Conversion {

    public static void main(String[] args) {

    }

    public static double conversion(double [] poly,double x){
        double polyValue = 0.0;
        for (int i = 0; i < poly.length; i++) {
            polyValue = polyValue * x + poly[i];
        }
        return polyValue;
    }
}
