package ArrayListObjetos;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
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
import java.util.ArrayList;

public class Empresa {

    public Empresa() {
    }

    public static void main(String[] args) {
        // Instancia los empleados
        Empleado juana = new Empleado("Julieta", "32.252.485", 29);
        Empleado pedro = new Empleado("Roberto", "34.548.789", 28);
        Empleado marcos = new Empleado("Marcos", "31.252.145", 30);
        Empleado angie = new Empleado("Angie", "28.598.924", 38);
        Empleado brianna = new Empleado("Brianna", "37.252.274", 27);
        Empleado matias = new Empleado("Matias", "26.275.482", 40);

        // Agrupa los empleados
        ArrayList<Empleado> losEmpleados = new ArrayList<Empleado>();
        losEmpleados.add(juana);
        losEmpleados.add(pedro);
        losEmpleados.add(marcos);
        losEmpleados.add(angie);
        losEmpleados.add(brianna);
        losEmpleados.add(matias);

        // Informa los datos de todos los empleados
        System.out.println("[Listado de empleados de la fabrica]");
        informarDatosDeEmpleados(losEmpleados);

        // Informa cuantos empleados tiene la fabrica
        System.out.println("\nLa fabrica tiene en total " + losEmpleados.size() + " empleados.");

        // Informa los datos de los empleados menores de 30 años
        System.out.println("\n[Listado de empleados menores de 30 anios]");
        informarDatosDeEmpleados(obtenerEmpleadosMenosDe30(losEmpleados));
    }

    public static ArrayList<Empleado> obtenerEmpleadosMenosDe30(ArrayList<Empleado> losEmpleados) {
        // Instancia el arrayList empleadosMenores
        ArrayList<Empleado> empleadosMenores = new ArrayList<Empleado>();

        // Recorre losEmpleados y obtiene los que son menores a 30 años
        for (int indice = 0; indice < losEmpleados.size(); indice++) {
            // Obtiene el objeto y lo castea a un objeto empleado
            Empleado unEmpleado = (Empleado) losEmpleados.get(indice);

            // Si el empleado tiene menos de 30 a�os, lo selecciona
            if (unEmpleado.getEdad() < 30) {
                empleadosMenores.add(unEmpleado);
            }
        }
        return empleadosMenores;
    }

    public static void informarDatosDeEmpleados(ArrayList<Empleado> losEmpleados) {
        // Recorre losEmpleados e informa sus datos
        for (int indice = 0; indice < losEmpleados.size(); indice++) {
            // Obtiene el objeto y lo castea a un objeto empleado
            Empleado unEmpleado = (Empleado) losEmpleados.get(indice);

            // Informa sus datos
            System.out.println("\t" + indice + ". " + unEmpleado.getNombre() + "\t -- " + unEmpleado.getDni() + " -- \t"
                    + unEmpleado.getEdad());
        }
    }

}
