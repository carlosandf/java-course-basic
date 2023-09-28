public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        isTurnOnLight = turnOnOffLight();

        for (int i = 1; (isTurnOnLight && i <= 10); i++) {
            System.out.println(i + " " + sosMessage());
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
