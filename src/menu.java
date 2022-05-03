import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

        public static void main(String[] args) {

            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {

                System.out.println("1. Agregar Jugador");
                System.out.println("2. Ver lista de Jugadores");
                System.out.println("3. Eliminar Jugador");
                System.out.println("4. Cambiar parametros");
                System.out.println("5. Iniciar juego");
                System.out.println("6. salir");

                try {

                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1 -> System.out.println("Has seleccionado la opcion 1");
                        case 2 -> System.out.println("Has seleccionado la opcion 2");
                        case 3 -> System.out.println("Has seleccionado la opcion 3");
                        case 4 -> System.out.println("Has seleccionado la opcion 4");
                        case 5 -> System.out.println("Has seleccionado la opcion 5");
                        case 6 -> salir = true;
                        default -> System.out.println("Solo números entre 1 y 6");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }
        }
}



