public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Seleccionaste Ligth Mode");
                break;
            case "Nigth":
                System.out.println("Selecionaste Nigth Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccinoaste Blue Nigth Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción");
        }
    }
}
