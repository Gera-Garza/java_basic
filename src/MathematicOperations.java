public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y=3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Regresa el mayor entre dos numeros
        System.out.println(Math.max(x,y));

        //Regresa la raiz cuadara
        System.out.println(Math.sqrt(y));

        //Area de un ciruclo
        //pi * r2
        System.out.println(Math.PI*Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));
    }
}
