package Unidad1;

public class Practica4 {
    public static void main(String[] args) {
        String t="Queso con crema";
        int i=0;
        String s=" ";
        
        System.out.println("La palabra es: "+t);
    while (i<t.length()){
        char l=t.charAt(i);
        int t2= (int)l;
        System.out.println(t2+" = "+l);
        s =s + " "+t2;
        i++;
    }
        System.out.println("En codigo ASCII: "+s);
    }
}
