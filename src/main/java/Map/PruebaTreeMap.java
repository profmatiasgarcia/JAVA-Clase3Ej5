package Map;

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
