public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.45612346;
        float nF = 123.456F;

        var salary = 1000;  //int
        //pension 3% de salario
        var pension = salary*0.03;  //double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Gerardo Garza";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary );

    }
}
