public class Exercises {
    public static void main(String[] args) {
        String myName = "Carlos";
        String momName = "Gricelda";
        String dadName = "Antonio";
        String grandMotherName = "Georgina";

        System.out.println(myName);
        System.out.println(momName);
        System.out.println(dadName);
        System.out.println(grandMotherName);

        char a = 'z'; // conviertelo a int
        int b = a;
        System.out.println(b);

        int c = 250; // conviertelo a long y luego de long a short
        long d = c;
        System.out.println(d);

        short e = (short) d;
        System.out.println(e);

        double f = 301.067; // conviertelo a long
        long g = (long) f;
        System.out.println(g);

        int h = 100; // súmale 5000.66 y conviertelo a float
        float i = h + 5000.66F;
        System.out.println(i);

        int j = 737; // multiplícalo por 100 y conviertelo a byte
        byte k = (byte) (j * 100);
        System.out.println(k);

        double l = 298.638; // divídelo entre 25 y conviertelo a long
        long m = (long) l / 25;
        System.out.println(m);
    }
}
