public class IfStatements {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // send file
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            fileSended--;
            System.out.println("Por favor enciende el Bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
