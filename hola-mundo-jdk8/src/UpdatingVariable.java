public class UpdatingVariable {
    public static void main (String[] args) {
        int salary = 1000;
        System.out.println(salary);

        // bono $200
        salary += 200; // salary = salary + 200
        System.out.println(salary);

        // Pensión $50
        salary -= 50; // salary = salary - 50
        System.out.println(salary);

        // 2 Horas extra $30 c/u
        // Comida $45
        salary += (30*2) - 45;
        System.out.println(salary);

        // actualizar cadenas de texto
        String employeeName = "Andres Florez";
        System.out.println(employeeName);

        employeeName += " Fontalvo";
        System.out.println(employeeName);

        employeeName = "Carlos " + employeeName;
        System.out.println(employeeName);
    }
}
