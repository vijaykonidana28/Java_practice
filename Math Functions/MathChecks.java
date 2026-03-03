public class MathChecks {
    public static void main(String[] args) {
        double x = 0.0 / 0.0;
        double y = 1.0 / 0.0;

        System.out.println(Double.isNaN(x));
        System.out.println(Double.isInfinite(y));
    }
}