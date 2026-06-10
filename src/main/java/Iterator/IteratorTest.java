package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

    public static void main(String[] args) {

        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        listaAlumnos.add(new Alumno(101, "Maria"));
        listaAlumnos.add(new Alumno(102, "Juan"));
        listaAlumnos.add(new Alumno(103, "Matias"));
        listaAlumnos.add(new Alumno(104, "Ana"));

        Iterator<Alumno> iterator = listaAlumnos.iterator();

        while (iterator.hasNext()) {

            Alumno alumno = iterator.next();

            System.out.println(alumno);
        }

        System.out.println("Eliminar un objeto");
        Iterator<Alumno> iteratorRemove = listaAlumnos.iterator();

        while (iteratorRemove.hasNext()) {

            Alumno alumno = iteratorRemove.next();

            if (alumno.getLegajo() == 103) {
                iteratorRemove.remove();
            }
        }

        System.out.println("Mostrar con for");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

        System.out.println("Buscar un elemento 102");
        Iterator<Alumno> iteratorBusqueda = listaAlumnos.iterator();

        int legajoBuscado = 102;

        while (iteratorBusqueda.hasNext()) {

            Alumno alumno = iteratorBusqueda.next();

            if (alumno.getLegajo() == legajoBuscado) {
                System.out.println("Alumno encontrado: " + alumno);
                break;
            }
        }
    }
}
