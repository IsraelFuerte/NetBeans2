package Unidad1;

public class Practica3 {
    public static void main(String[] args) {
    
        String t= "Aprender a programar requiere paciencia y mucha práctica diaria con los códigos. "
                + "Dominar el uso de los métodos de búsqueda ayuda a manipular textos eficazmente. "
                + "La lógica es la base para resolver problemas complejos y crear aplicaciones increíbles hoy mismo ";
        char b='a';
        
        int p= t.indexOf("mucha");
        System.out.println(p +" = mucha");
        
        int q=t.indexOf(b);
        System.out.println(q + " = "+b);
        
        int r=t.indexOf("paciencia", 2);
        System.out.println(r +" = paciencia");
        
        int s=t.indexOf("o", 3);
        System.out.println(s +" = o ");
        
        int u=t.indexOf("manipular textos", 10, 200);
        System.out.println(u+" = manipular textos");
        
        int v=t.indexOf("i", 5, 150);
        System.out.println(v+" = i ");
        
    }
}
