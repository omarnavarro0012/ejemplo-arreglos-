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
    
    public void inscribir(Estudiante unestudiante)
    {
        for (int i=0;i<estudiantes.length;i++)
        {
            if (estudiantes[i]==null)
            {
                estudiantes[i]=unestudiante;
                break;
            }
        }
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
}
   //dar de baja a un estudiante 
   /*public void dabaja(int claveESTU)
   {
       
   }*/