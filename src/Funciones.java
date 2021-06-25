public class Funciones {
    public static void main(String[] args) {
        double y=3;

        //Area de un ciruclo
        //pi * r2
        System.out.println(area(y));

        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println(sphereVol(y));

        //convertidor de moneda a doalres
        System.out.println("Pesos a dolares: " + covertToDolar(1000,"MXN"));
    }

    public static double area(double rad){
        return Math.PI*Math.pow(rad,2);
    }
    public static double sphereArea(double rad){
        return 4*Math.PI*Math.pow(rad,2);
    }
    public static double sphereVol(double rad){
        return (4/3)*Math.PI*Math.pow(rad,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda que se desa convertir
     * @return  quantity regresa la cantidad de la moneda convertida a dolares<
     *
     * */
    public static double covertToDolar(double quantity, String currency){
        //MXN

        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return  quantity;
    }
}
