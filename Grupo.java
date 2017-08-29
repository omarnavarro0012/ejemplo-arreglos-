public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    //constructor
    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes= new Estudiante[totalEstudiantes];
        this.nombreMateria=nomMateria;
    }
    
    /**
     * busca un espacio disponible en el arreglo.
     * regresa @return una posicion nula en el arreglo.
     * 
     */
    private int buscaEspacioDip()
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if (estudiantes[i]==null)
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * inscribe un estudiante nuevo en el grupo.
     * @param un estudiantees el objeto estudiante a inscribir a el grupo.
     * @return regresa verdadero su el estudiante fue inscrito o falso en caso
     * de que no se puede inscribir.
     */
    public boolean inscribir(Estudiante unestudiante)
    {
        int existe=this.buscarEs(unestudiante.Darclave());
        
        if (existe==-1)
        {
            return false;//el alumno ya esta inscrito.
        }
        int posDip= this.buscaEspacioDip();
        if(posDip!=-1)
        {
            return false; //el arreglo esta lleno
        }
        estudiantes[posDip]=unestudiante;//inscribe un alumno
        return true; 
    }            
          
    public void darBaja(int claveAlum)
    {
        for (int i=0;i<estudiantes.length;i++)
        {
            if(claveAlum==estudiantes[i].Darclave())
            {
                estudiantes[i]=null;
                break;
            }
        }
    }
    
    /**
       *busca un estudiante mediante el parametro @param claveAlum 
       *y regresa el posicion en donde se encuentra ese alumno
       *o -1 si no existe.
    */
   private int buscarEs(int claveAlum)
    
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].Darclave()==claveAlum)
            {
                return i;
            }
        }
        return -1;
    }
}
