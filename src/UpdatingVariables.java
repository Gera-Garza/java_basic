public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono
        salary += 200;
        System.out.println(salary);

        //pension: 50 descuento
        salary -= 50;
        System.out.println(salary);

        //trabajo de 2 horas extra $30 c/u
        //comida: $45
        salary += (30*2)- 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String empleado = "guillermo";
        empleado +=" garza";
        System.out.println(empleado);

        empleado = "gerardo " + empleado;
        System.out.println(empleado);
    }
}
