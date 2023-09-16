public class DataTypes {
    public static void main(String[] args) {
        byte $byte = 127; // Range: -128 to 127 -> 1 byte
        short $short = 32767; // Range: -32,768 to 32,767 -> 2 bytes
        int $int = 2147483647; // Range: -2,147,483,548 to 2,147,483,647 -> 4 bytes

        // Range: -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 -> 8 bytes
        long $long = 9223372036854775807L; // L al final para indicar que es un long

        // Range: 1.40129846432481707e-45 to 3.40282346638528860e+38 -> 4 bytes
        float $float = 3.40282346638528860F; // F al final para indicar que es un float

        // Range: 4.94065645841246544e-324d to 1.79769313486231570+308d -> 8 bytes
        double $double = 4.94065645841246544;

        char $char = 'C'; // Range: Unicode; single quotes ('') -> 2 bytes

        boolean $boolean = true; // Range: true or false -> 2 bytes

        // Inferencia de datos (a partir de Java 10)
        var age = 20; // infiere que es de tipo int
        var name = "Carlos"; // infiere que es de tipo String
        var adult = true; // infiere que es de tipo boolean

        var salary = 1000;
        // pension 3%
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
    }
}
