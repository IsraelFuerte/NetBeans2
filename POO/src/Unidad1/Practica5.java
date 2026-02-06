package Unidad1;

public class Practica5 {
    public static void main(String[] args) {
        
     String t="Andamos baliendo queso";   
     String suma=" ";
        for (int i = 0; i < t.length(); i++) {
            char l=t.charAt(i);
            int t2= (int)l;
            System.out.println(l +" = "+t2);
            suma = suma + " "+t2;
        }
        System.out.println("codigo ASCII: "+suma);
     
    }
}
