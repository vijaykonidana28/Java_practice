import java.text.DecimalFormat;
// Formatting the decimal format upto the requiered format.
public class Deciform
{
    public static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String args[])
    {
        double x= 13.251545f;
        System.out.print(df.format(x));
    }
}