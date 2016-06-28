import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by ivanpryshchepau on 6/22/16.
 */
public class _Runner {

    public static void main(String[] args) {
        System.out.println(calculate(args[0], args[1], args[2]));
    }

    public static double calculate(String aS, String bS, String cS) {
        double result;
        try {
            double a = Double.parseDouble(aS);
            double b = Double.parseDouble(bS);
            double c = Double.parseDouble(cS);

            result = ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - (pow(a, 3) * c) + (pow(b, -2));
        } catch (NumberFormatException e) {
            System.out.println("Write 3 numbers (double)");
            return 0;
        }
        return result;
    }

}
