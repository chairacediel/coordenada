package ejecutable;

import modelo.coordenada;

/**
 *
 * @author Estudiante
 */
public class ejecutable 
{
    public static void main(String[] args)
    {
        coordenada cl = new coordenada();
        cl. setx (2.5);
        cl. sety (4.5);
        
        System.out.println("coordenada x1: " + cl.getx());
        System.out.println("coordenada y1: " + cl.gety());
        System.out.println(a);
        
        coordenada c2 = new coordenada();
        c2.setx (2.5);
        c2.sety (4.5);
        
        
        
        System.out.println("coordenada x2: " + b.getX());
        System.out.println("coordenada y2: " + b.getY());
        System.out.println(c2);
        
        coordenada c;
        c = cl;
        
         if(cl.equals(c2))
       {
         System.out.println("Coordenadas iguales " );
         
       }
       else
       {
         System.out.println("Coordenadas diferentes ");
       
       
       
    }
}

