public class Functions {
    public static void main(String[] args) {
        double r = 3;
        // Area de un circulo
        // PI * r^2
        double circle_area = circleArea(r);
        System.out.println("circle area: " + circle_area);

        // Area de una esfera
        // 4 * PI * r^2
        double sphere_area = sphereArea(r);
        System.out.println("sphere area: " + sphere_area);

        // Volumen de una esfera
        // (4/3) * PI * r^3
        double sphere_vol = sphereVolume(r);
        System.out.println("sphere volume: " + sphere_vol);

        System.out.println("PESOS A DOLARES: " + convertToDollar(50000, "COP"));
    }

    public static double circleArea (double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double sphereArea (double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public static double sphereVolume (double radio) {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    public static double convertToDollar (double quantity, String currency) {
        switch (currency) {
            case "MXN":
                return quantity * 0.057;
            case "COP":
                return quantity * 0.00025;
            default:
                return 0;
        }
    }
}
