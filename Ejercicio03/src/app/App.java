// Se realizan los ejercicios 3 y 4.
// Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
// números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
// para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
// una división con los dos numeros y mostrar el resultado.
package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.DivisionNumero;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivisionNumero div = new DivisionNumero();
        try {

            System.out.println("Ingrese un numero 1");
            String num1 = scanner.nextLine();
            System.out.println("Ingrese un numero 2 ");
            String num2 = scanner.nextLine();

            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            // DivisionNumero
            div.division(numero1, numero2);

        } catch (InputMismatchException e) {
            System.out.println("Error: El tipo de dato ingresado es incorrecto " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: El dato ingresado no puede convertirse en int. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero " + e.getMessage());
        }

    }
}
