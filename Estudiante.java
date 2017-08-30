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
    /**
     * regresa una cadena con las caracteristicas del estudiante.
     */
    public String dimeDet()
    {
        return "clave:"+clave+"Estudiante: "+nombre;
        
    }
    
    /**
     * //se regresa la clave para poder checar en el dar de baja ya que no es un metodo si no una variable.
     */
    public int Darclave()
    {
        
        return clave;
    }
}