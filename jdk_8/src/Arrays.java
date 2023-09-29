public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        int days[] = new int[7];

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println();
        System.out.println();

        String[][] cities = new String[4][2];
        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[10] = "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion: androidVersions) {
            System.out.println("forEach -> " + androidVersion);
        }
        System.out.println(java.util.Arrays.toString(androidVersions));

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pair: cities) {
            for (String city: pair) {
                System.out.println("forEach -> " + city);
            }
        }

        System.out.println(java.util.Arrays.deepToString(cities));
        System.out.println(java.util.Arrays.toString(cities[0]));

        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        System.out.println(java.util.Arrays.deepToString(animals));
    }
}
