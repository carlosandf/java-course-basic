public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // redondea hacia arriba
        System.out.println(Math.ceil(x)); // 3.0

        // redondea hacia abaso
        System.out.println(Math.floor(x)); // 2.0

        // Elevar un numero a la potencia
        // Math.pow(numero, exponente)
        System.out.println(Math.pow(5, 3)); // 125

        // devuelve el munero de mayor valor
        System.out.println(Math.max(x, y)); // 3

        // obtener la raiz cuadrada de un numero
        System.out.println(Math.sqrt(4)); // 2

        // Area de un circulo
        // PI * r^2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Area de una esfera
        // 4 * PI * r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera
        // (4/3) * PI * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
