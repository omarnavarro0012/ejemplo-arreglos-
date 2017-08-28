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
    //terminar de tarea este metodo
    public void inscribir(Estudiante unestudiante)
    {
        if (estudiantes[0]==null)
        {
        estudiantes[0]=unestudiante;
        }
    }
}
   //dar de baja a un estudiante 
   /*public void dabaja(int claveESTU)
   {
       
   }*/