import java.util.Random;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // Pool de nombres para elegir
    private String[] nombres;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        nombres = new String[5];
        nombres[0] = "Dani";
        nombres[1] = "Edu";
        nombres[2] = "Julia";
        nombres[3] = "Ana";
        nombres[4] = "Alejandro";
        Alumno alumno1 = generaAlumno();
        Alumno alumno2 = generaAlumno();
        Alumno alumno3 = generaAlumno();
        Alumno alumno4 = generaAlumno();
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
    }

    /**
     * Crea un alumno aleatorio
     */
    public Alumno generaAlumno()
    {
        Random rnd = new Random();
        String nombre = nombres[rnd.nextInt(5)];
        int edad = rnd.nextInt(10) + 15;
        Alumno alumno = new Alumno(nombre, edad);
        int numNotas = rnd.nextInt(5) + 2;
        for(int i = 0; i < numNotas; i++)
        {
            alumno.addNota(rnd.nextInt(11));
        }
        return alumno;
    }
}
