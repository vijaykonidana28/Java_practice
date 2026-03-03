public class FloatingPointUtils {
    public static void main(String[] args) {
        double x = -10.5;

        System.out.println(Math.signum(x));
        System.out.println(Math.copySign(5.0, -1.0));
        System.out.println(Math.nextUp(1.0));
        System.out.println(Math.nextDown(1.0));
        System.out.println(Math.ulp(1.0));
        System.out.println(Math.scalb(2.0, 3));
    }
}
