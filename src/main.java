//package com.andy.pa.proyecto2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class main {
    public class Persona<string> {
        private String alias;
        private int puntaje_maximo;
        private int edad;
        private static String nombre;
        private Date ufechaingreso;
        private static String contraseña;


        public Persona() {

        }

        public Persona(String alias, int puntaje_maximo, int edad, String nombre, Date ufechaingreso, String contraseña) {
            this.alias = alias;
            this.puntaje_maximo = puntaje_maximo;
            this.edad = edad;
            this.nombre = nombre;
            this.ufechaingreso = ufechaingreso;
            this.contraseña = contraseña;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getPuntaje_maximo() {
            return puntaje_maximo;
        }

        public void setPuntaje_maximo(int puntaje_maximo) {
            this.puntaje_maximo = puntaje_maximo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Date getUfechaingreso() {
            return ufechaingreso;
        }

        public void setUfechaingreso(Date ufechaingreso) {
            this.ufechaingreso = ufechaingreso;
        }

        public String getContraseña() {
            return contraseña;
        }

        /*
       public string pidedatos() {

            Scanner usuario = new Scanner(System.in);
            System.out.println("BIENVENIDO A BATALLANAVAL");
            System.out.println("ingrese nombre:");
            String nombrep = usuario.nextLine();
            return (string) nombre;
        }

        public string pidecontraseña(String contraseña) {

            Scanner usuario = new Scanner(System.in);
            System.out.println("BIENVENIDO A BATALLANAVAL");
            System.out.println("ingrese contraseña:");
            contraseña = usuario.nextLine();
            return (string) contraseña;
        }
*/
        private void login(string nombre, string contraseña) throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("usuarioycontraseña.csv"));
            String linea = ((BufferedReader) reader).readLine();
            boolean datosLoginEncontrados = false;

            while (linea != null && datosLoginEncontrados == false) {
//En linea tenemos nombre y password juntos, separados por un punto y coma.
//Usamos split() para que "corte" el String a partir de del punto y coma
//Esto nos dará un array con dos elementos, el primer elemento contendrá el nombre y el segundo el password
                String[] datosLogin = linea.split(";");
//Ya tenemos los datos separados, comprobamos si coinciden
                if (datosLogin[0].equals(nombre) && datosLogin[1].equals(contraseña))
                    datosLoginEncontrados = true;//Al pasar a true, el bucle while finalizará
                else
                    linea = reader.readLine();

            }

            if (datosLoginEncontrados) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("No esta registrado");
            }
        }

    }
}