package Unidad1;

public class Practica1 {
    public static void main(String[] args) {

        String t = "Hola crayola";
        String b = "a";

        int p = t.indexOf(b);
        int contador = 0;

        while (p != -1) {
            System.out.println(p);   // solo imprime cuando sí hay "a"
            contador++;

            p = t.indexOf(b, p + 1);
        }

        System.out.println("La letra 'a' se encontró " + contador + " veces.");
    }
}
