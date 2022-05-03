import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

        public static void main(String[] args) {
            boolean salir = false;
            boolean contrasenaIncorrecta = false;
            while (!salir) {
                String usuario;
                String usuarioCSV = "";
                String contrasena;
                String contrasenaCSV = "";

                if( contrasenaIncorrecta ) {
                    System.out.println("Contrasena incorrecta, intente nuevamente");
                }else {
                    System.out.println("Bienvenido a batalla naval");
                }

                System.out.println("Ingrese usuario");
                usuario = pideUsuario();
                System.out.println("Ingrese contrasena");
                contrasena = pidecontrasena();

                if( validarUsuarioYContrasena(usuario, contrasena) ) {
                    mostrarMenu();
                }else{
                    contrasenaIncorrecta = true;
                }
            }
        }

        public static String pideUsuario() {
            Scanner scanner = new Scanner(System.in);
            String usuario = scanner.nextLine();
            return (String) usuario;
        }

        public static String pidecontrasena() {
            Scanner scanner = new Scanner(System.in);
            String contrasena = scanner.nextLine();
            return (String) contrasena;
        }

        public static boolean validarUsuarioYContrasena ( String usuario, String contrasena ){
            String[][] datos = new String[10][10];
            final int user = 0;
            final int pass = 1;
            try {
                File directory = new File("");
                String absolutePath = directory.getAbsolutePath();
                BufferedReader reader = new BufferedReader(new FileReader(absolutePath +"/usuarioycontrasena.csv"));

                int indice = 0;
                String linea = reader.readLine();
                while( linea != null) {
                    String[] registro = linea.split(";");
                    datos[indice][user] = registro[user];
                    datos[indice][pass] = registro[pass];
                    linea = reader.readLine();
                    indice++;
                }

                for (int i = 0; i < 3; i++) {
                    String[] dato = datos[i];
                    if( dato[user].equals(usuario) && dato[pass].equals(contrasena) ) {
                        return true;
                    }
                }
                return false;

            } catch (Exception e){
                System.out.println(e);
            }
            return false;
        }

        public static void mostrarMenu(){
            Scanner sn = new Scanner(System.in);
            int opcion;
            boolean salir = false;

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



