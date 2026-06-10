package ArrayList3;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2026 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import java.util.*;

public class ListaAlumnos {

    static double prom;

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);

        int op;
        ArrayList lista = new ArrayList();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

        do {
            Alumno nodo = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            nodo.setNombre(leer.next());
            System.out.println("Ingrese la primera calificación:");
            nodo.setCalificacion1(leer.nextInt());
            System.out.println("Ingrese la segunda calificación:");
            nodo.setCalificacion2(leer.nextInt());
            System.out.println("Ingrese la tercera calificación:");
            nodo.setCalificacion3(leer.nextInt());

            cargarArrayListStrings(lista, nodo);

            cargarArrayListObjetos(listaAlumnos, nodo);

            System.out.println("¿Desea ingresar otro alumno?");
            System.out.println("1.-Si\t 2.-No");
            op = leer.nextInt();
        } while (op != 2);

        List lista2 = new ArrayList(lista);

        Iterator it = lista2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "");
        }

        mostrarArrayListObjetos(listaAlumnos);

        System.out.println("Ingrese nombre del Alumno a eliminar: ");
        String nombre = leer.next();
        eliminarAlumnoArrayList(listaAlumnos, nombre);

        mostrarArrayListObjetos(listaAlumnos);

    }

    private static double promedio(double calif1, double calif2, double calif3) {
        double suma = calif1 + calif2 + calif3;
        prom = suma / 3;
        return prom;
    }

    private static void cargarArrayListStrings(ArrayList listado, Alumno nodo) {
        listado.add("Nombre del alumno: " + nodo.getNombre());
        listado.add("Calificación 1: " + nodo.getCalificacion1());
        listado.add("Calificación 2: " + nodo.getCalificacion2());
        listado.add("Calificación 3 " + nodo.getCalificacion3());
        promedio(nodo.getCalificacion1(), nodo.getCalificacion2(), nodo.getCalificacion3());
        listado.add("Su promedio es: " + prom);
    }

    private static void cargarArrayListObjetos(ArrayList listaAlum, Alumno nodo) {
        listaAlum.add(nodo);
    }

    private static void mostrarArrayListObjetos(ArrayList listadoAlum) {
        Iterator it = listadoAlum.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void eliminarAlumnoArrayList(ArrayList listado, String nom) {
        Iterator AlumIterator = listado.iterator();

        while (AlumIterator.hasNext()) {
            Alumno elemento = (Alumno) AlumIterator.next();

            if (elemento.getNombre().equals(nom)) {
                AlumIterator.remove();
            }

        }
    }
}
