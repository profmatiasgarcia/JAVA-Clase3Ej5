package Map;

import java.util.HashMap;

public class EjemploHashMap {

    public static void main(String[] args) {

        // Crear el HashMap
        HashMap<Integer, String> alumnos = new HashMap<>();

        // Agregar elementos (clave, valor)
        alumnos.put(1001, "Juan Perez");
        alumnos.put(1002, "Matias Garcia");
        alumnos.put(1003, "Carlos Lopez");

        // Mostrar todo el HashMap
        System.out.println("Contenido del HashMap:");
        System.out.println(alumnos);

        // Obtener un valor a partir de una clave
        String nombre = alumnos.get(1002);
        System.out.println("\nAlumno con legajo 1002: " + nombre);

        // Verificar si existe una clave
        if (alumnos.containsKey(1001)) {
            System.out.println("Existe el legajo 1001");
        }

        // Eliminar un elemento
        alumnos.remove(1003);

        // Recorrer el HashMap
        System.out.println("\nListado de alumnos:");

        for (Integer legajo : alumnos.keySet()) {
            System.out.println("Legajo: " + legajo
                    + " - Nombre: " + alumnos.get(legajo));
        }
    }
}
