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

    /**
     * Añade notas al alumno
     * @param Nota Nota a añadir
     */
    public void addNota(int nota)
    {
        notas.add(nota);
    }

    /**
     * Devuelve la media de las notas del alumno
     * @return La media de las notas del alumno
     */
    public int notaMedia()
    {
        int sumatorio = 0;
        // Sumamos todos los elementos del array
        for(int i = 0; i < notas.size(); i++){
            sumatorio += notas.get(i);
        }
        // Devolvemos la media
        return (sumatorio/notas.size());
    }
    
    /**
     * Devuelve si el alumno esta o no aprobado
     * @return True si esta aprobado, false si no
     */
    public boolean aprobado()
    {
        return (notaMedia() > NOTA_APROBADO);
    }

}
