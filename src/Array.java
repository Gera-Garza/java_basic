public class Array {
    public static void main(String[] args) {
        String androidVersions[] = new String[17];
        String[] days = new String[7];

        String cities[][] = new String[4][2];
        int numbers[][][] = new int[1][2][3];
        int numbers4[][][][] = new int[2][2][2][2];

        androidVersions[0]= "Apple Pie";
        androidVersions[1]= "Bannana Bread";
        androidVersions[2]= "Cupcake";
        androidVersions[3]= "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();
        System.out.println();

        cities[0][0] = "colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        String animal[][][][] = new String[2][3][2][2];
        animal[1][0][0][1] = "monkey";
        System.out.println();
        System.out.println();
        System.out.println(animal[1][0][0][1]);


    }
}
