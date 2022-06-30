package modelo;

/**
 *
 * @author Estudiante
 */
public class coordenada
{
    private double x;
    private double y;
    
    public coordenada()
    {
        
    }
    public coordenada (double x, double y) 
    {
        this .x =x;
        this.y=y;
        
    }
    public double getx()
    {
        return x;
    }
    public void setx(double x)
    {
        this .x= x;
    }
     public double gety()
    {
        return y;
    }
    public void sety(double y)
    {
        this .y= y;
    }
    public String toString()
    {
        return x + "/" + y;
    }
    
    public boolean equals(Object o)
    {
        coordenada otra = (coordenada)o;
        return (x==otra.x) && (y==otra.y) ;
        
    }

}




