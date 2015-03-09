package pkg;

/**
 * Una arraylist con base en una array tradicional
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Una array para guardar los numeros enteros
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // Inicializamos con un valor 0 posiciones para no desperdiciar
        // espacio en ningun momento
        lista = new int[0];
    }

    /**
     * Metodo que añade un elemento a la arrayList
     * @param elemento El elemento a añadir
     */
    public void add(int elemento)
    {
        // Creamos una lista temporal, transpasamos todos los numeros con un
        // for, y añadimos el numero en la ultima posicion
        int tamanio = lista.length;
        int[] temporal = new int[tamanio + 1];
        for(int i = 0; i < tamanio; i++)
        {
            temporal[i] = lista[i];
        }
        temporal[tamanio] = elemento;
        // Por ultimo pasamos la lista temporal a lista
        lista = temporal;
    }

    /**
     * Metodo que añade un elemento a la arrayList en la posicion indicada
     * @param index La posición donde colocar el numero
     * @param elemento El elemento a añadir
     */
    public void add( int index, int elemento)
    {
        // Comprobamos que sea un indice valido, es decir, que se encuentre en el 
        // tamaño de la lista
        // de lo contrario muestra un mensaje de error
        int tamanio = lista.length;
        if ((index <= tamanio) && (index >= 0))
        {
            // Creamos una lista temporal, transpasamos todos los numeros con un
            // while, pero al llegar al indice indicado introducimos el numero introducido
            // como parametro
            int[] temporal = new int[tamanio + 1];
            int indiceTemp = 0;
            int indiceLista = 0;
            while(indiceLista < tamanio)
            {
                if(indiceTemp == index)
                {
                    temporal[indiceTemp] = elemento;
                }
                else
                {
                    temporal[indiceTemp] = lista[indiceLista];
                    indiceLista++;
                }
                indiceTemp++;
            }
            // Por ultimo pasamos la lista temporal a lista
            lista = temporal;
        }
        else
        {
            System.out.println("El indice indicado no es valido, utiliza un valor entre 0 y " + tamanio);
        }
    }

    /**
     * Metodo para vaciar una colección
     */
    public void clear()
    {
        lista = new int[0];
    }

    /**
     * Metodo que devuelve true si el array contiene ese elemento
     * @param elemento El elemento a buscar
     * @return True si lo contiene, false si no
     */
    public boolean contains(int elemento)
    {
        // Creamos el boolean que devolveremos como false y un indice
        boolean encontrado = false;
        int indice = 0;
        while (indice < lista.length && !(encontrado))
        {
            if (lista[indice] == elemento)
            {
                encontrado = true;
            }
            indice++;
        }
        return encontrado;
    }

    /**
     * Metodo que devuelve el elemento que se encuentra
     * en la posicion introducida.
     * @return El elemento en esa posicion. Si el valor no es valido
     * devuelve -1.
     */
    public int get(int index)
    {
        // Inicializamos el valor a devolver a -1, si es un indice
        // valido le cambiamos el valor
        int elemento = -1;
        if (index >= 0 && index < lista.length)
        {
            elemento = lista[index];
        }
        return elemento;
    }

    /**
     * Metodo que añade un elemento a la array en la posicion indicada
     * sobreecribiendo el que se encontraba en esa posición
     * @param index La posición donde colocar el numero
     * @param elemento El elemento a añadir
     */
    public void set( int index, int elemento)
    {
        // Comprobamos que sea un indice valido, es decir, que se encuentre en el 
        // tamaño de la lista
        if ((index <  lista.length) && (index >= 0))
        {
           // Cambiamos el elemento de la posicion indicada 
           lista[index] = elemento;
        }
    }

    /**
     * Metodo que devuelve el indice de la primera ocurrencia del ememento
     * introducido como parametro.
     * @param El elemento a buscar su posicion
     * @return La posicion del elemento introducido, o -1 si no se encuentra
     */
    public int indexOf(int elemento)
    {
        // Creamos el boolean que devolveremos como false y un indice
        boolean encontrado = false;
        int indice = 0;
        // Inicializamos el elemento buscado en -1, si se encuentra cambiara de valor
        int elemBuscado = -1;
        while (indice < lista.length && !(encontrado))
        {
            if (lista[indice] == elemento)
            {
                encontrado = true;
                elemBuscado = indice;
            }
            indice++;
        }
        return elemBuscado;
    }

    /**
     * Metodo que devuelve si la lista esta varia
     * @return True si esta vacia, false en caso contrario
     */
    public boolean isEmpty()
    {
        return (lista.length == 0);
    }

    /**
     * Metodo que elimina el elemento de la array en la posicion indicada
     * @param index La posición donde colocar el numero
     * @return El numero si el indice es valido, si no devuelve -1
     */
    public int remove(int index)
    {
        // Comprobamos que sea un indice valido, es decir, que se encuentre en el 
        // tamaño de la lista
        // de lo contrario muestra un mensaje de error
        int tamanio = lista.length;
        int eliminado = -1;
        if ((index <= tamanio) && (index >= 0) && (tamanio != 0))
        {
            // Creamos una lista temporal, transpasamos todos los numeros con un
            // while, pero al llegar al indice indicado eliminamos ese numero introducido
            // como parametro y continuamos
            int[] temporal = new int[tamanio - 1];
            int indiceTemp = 0;
            int indiceLista = 0;
            while(indiceLista < (tamanio))
            {
                if(indiceTemp != index)
                {
                    temporal[indiceTemp] = lista[indiceLista];
                    indiceTemp++;
                }
                else
                {
                    eliminado = lista[indiceLista];
                }
                indiceLista++;
            }
            // Por ultimo pasamos la lista temporal a lista
            lista = temporal;
        }
        return eliminado;
    }

    /**
     * Metodo que devuelve el tamaño de la coleccion
     * @return el tamaño de la coleccion
     */
    public int size()
    {
        return lista.length;
    }

}