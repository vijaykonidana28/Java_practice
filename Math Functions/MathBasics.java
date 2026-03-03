public class MathBasics {
    public static void main(String[] args) {
        int a = -10, b = 20;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.abs(a));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        System.out.println(Math.addExact(10, 20));
        System.out.println(Math.subtractExact(50, 30));
        System.out.println(Math.multiplyExact(5, 6));
    }
}