package Map;
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
import java.util.Map;
import java.util.TreeMap;

public class PruebaTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, Alumno> alumnos = new TreeMap<>();

        alumnos.put(105, new Alumno(105, "Juan", "Perez"));
        alumnos.put(101, new Alumno(101, "Maria", "Gomez"));
        alumnos.put(103, new Alumno(103, "Matias", "Garcia"));
        alumnos.put(102, new Alumno(102, "Ana", "Martinez"));

        System.out.println("Listado ordenado por legajo:");

        for (Map.Entry<Integer, Alumno> entry : alumnos.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("orden por nombre del alumno");
        TreeMap<String, Alumno> alumnosPorNombre = new TreeMap<>();

        alumnosPorNombre.put("Juan", new Alumno(105, "Juan", "Perez"));
        alumnosPorNombre.put("Maria", new Alumno(101, "Maria", "Gomez"));
        alumnosPorNombre.put("Matias", new Alumno(103, "Matias", "Garcia"));
        alumnosPorNombre.put("Ana", new Alumno(102, "Ana", "Martinez"));

        for (Alumno alumno : alumnosPorNombre.values()) {
            System.out.println(alumno);
        }
    }
}
