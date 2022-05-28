package pw3;

public class RoundingDouble {
    public static double roundingIn1(double d) {
        return Double.parseDouble(String.format("%.1f", d).replace(',', '.'));
    }

    public static double roundingIn2(double d) {
        return Double.parseDouble(String.format("%.2f", d).replace(',', '.'));
    }

    public static double roundingIn3(double d) {
        return Double.parseDouble(String.format("%.3f", d).replace(',', '.'));
    }

    public static double roundingIn4(double d) {
        return Double.parseDouble(String.format("%.4f", d).replace(',', '.'));
    }
}
