package Queue;
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
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Alumno> colaAlumnos = new PriorityQueue<>();

        colaAlumnos.add(new Alumno(1001, "Juan", 8.5));
        colaAlumnos.add(new Alumno(1002, "Ana", 9.2));
        colaAlumnos.add(new Alumno(1003, "Pedro", 7.8));
        colaAlumnos.add(new Alumno(1004, "Laura", 9.8));

        System.out.println("Alumnos según prioridad:\n");

        while (!colaAlumnos.isEmpty()) {
            System.out.println(colaAlumnos.poll());
        }
    }
}
