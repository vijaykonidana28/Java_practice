public class RandomDemo {
    public static void main(String[] args) {
        int min = 1, max = 6;

        int dice = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(dice);
    }
}
