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
    
    public int Darclave()
    {
        //se regresa la clave para poder checar en el dar de baja ya que no es un metodo si no una variable.
        return clave;
    }
}