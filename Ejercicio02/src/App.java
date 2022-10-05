// Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
// generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
// de rango).

public class App {
    public static void main(String[] args) throws Exception {
        try {
            int[] array = new int[1];
            array[0] = 1;
            array[3] = 1;
            
        } catch (Exception e) {
           System.out.println("Error: " + e);
        }

    }
}
