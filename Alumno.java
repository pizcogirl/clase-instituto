import pkg.ArrayListInt;

/**
 * Representa a un alumno del instituto
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // Nota minima de aprobado
    public static final int NOTA_APROBADO = 5;
    // Numero de alumnos en clase, para asignar
    public static int numAlumnosClase = 0;
    
    // Nombre del alumno
    private String nombre;
    // Edad del alumno
    private int edad;
    // Numero de clase
    private int numeroClase;
    // Conjunto de notas del alumno
    private ArrayListInt notas;

    /**
     * Constructor for objects of class Alumno
     * @param Nombre El nombre del alumno
     * @param Edad La edad del alumno
     */
    public Alumno()
    {
        // Inicializamos los atributos
        this.nombre = nombre;
        this.edad = edad;
        numeroClase = numAlumnosClase;
        // Aumentamos el numero de alumnos en clase
        numAlumnosClase += 1;
        notas = new ArrayListInt();
    }

}
