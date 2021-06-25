public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores de comparacion
        System.out.println("a es igual a b? -> "+ (a==b));
        System.out.println("a es diferente de b? -> "+ (a!=b));

        //operadores de relacion
        System.out.println("a es mayor a b? -> "+ (a>b));
        System.out.println("a es menor de b? -> "+ (a<b));
        System.out.println("a es mayor o igual a b? -> "+ (a>=b));
        System.out.println("a es menor o igual de b? -> "+ (a<=b));

        if(a == b){
            System.out.println("a es igual a b? -> "+ (a==b));
        }else if(a != b){
            System.out.println("a es diferente de b? -> "+ (a!=b));
        }else if(a > b){
            System.out.println("a es mayor a b? -> "+ (a>b));
        }else if(a < b){
            System.out.println("a es menor de b? -> "+ (a<b));
        }
    }
}
