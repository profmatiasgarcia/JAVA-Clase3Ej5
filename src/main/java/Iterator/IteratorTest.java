package Iterator;
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
