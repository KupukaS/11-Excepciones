// Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
// método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
// try-catch para probar la nueva excepción que debe ser controlada.

package app;

import entidades.Persona;
import servicios.ServicioPersona;

public class App {


    public static void main(String[] args) throws Exception {
        ServicioPersona ps = new ServicioPersona();
        try {
            Persona p1 = null;
            ps.esMayorDeEdad(p1);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
