public class WhileLoop {

    static  boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        turnOnOffLigth();

        int i=1;
        while (isTurnOnLigth && i<=10){
            printSOS();
            i++;
        }

        /*if(isTurnOnLigth){
            printSOS();
        }*/
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLigth() {

        isTurnOnLigth = (isTurnOnLigth)?false:true;
        /*
        if (isTurnOnLigth)
             isTurnOnLigth = false;
         else
             isTurnOnLigth = true;

         */
         return isTurnOnLigth;
    }
}
