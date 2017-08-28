public class Estudiante
{
    private String nombre;
    private int clave;
    
    //constructor
    public Estudiante (int claveIni,String nomIni)
    {
        nombre=nomIni;
        clave=claveIni;
    }
    
    //metodos
    public String dimeDet()
    {
        return "clave:"+clave+"Estudiante: "+nombre;
        
    }
}