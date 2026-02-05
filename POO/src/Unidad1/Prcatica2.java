package Unidad1;

public class Prcatica2 {
    public static void main(String[] args) {
        
        String t="hola crayola";
        String b="a";
        
        int c=0;
       int p=t.indexOf(b);

        while (p!=-1){
            System.out.println(p);
            c++;
            
            p=t.indexOf(b, p + 1);
        }
        System.out.println(c);
    }
    
}
