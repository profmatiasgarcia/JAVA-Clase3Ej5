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
