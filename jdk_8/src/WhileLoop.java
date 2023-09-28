public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        isTurnOnLight = turnOnOffLight();

        int i = 1;
        while (isTurnOnLight && (i <= 10)) {
            System.out.println(i + " " + sosMessage());
            i++;
        }
    }

    public static String sosMessage () {
        return ". . . _ _ _ . . .";
    }

    public static boolean turnOnOffLight () {
        // isTurnOnLight ? false : true; -> ternarias
        return !isTurnOnLight;
    }
}
