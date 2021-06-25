public class IfStatemet {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable) {
            fileSended++;
            System.out.println("Archivo enviado");
        }
        else
            System.out.println("Archivo no enviado");
        System.out.println(isBluetoothEnable);
    }
}
