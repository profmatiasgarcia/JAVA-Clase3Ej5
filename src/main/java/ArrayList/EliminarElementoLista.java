package ArrayList;
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
import java.util.Iterator;
import java.util.ListIterator;

public class EliminarElementoLista {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Matias");
        al.add("Angie");
        al.add("Brianna");
        al.add("Roberto");
        al.add("Blanca");

        // Recorrer un ArrayList con un Iterador
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Eliminamos el primer elemento
        al.remove(2);

        System.out.println("\n<<< ArrayList luego de eliminar elemento >>>");

        // Recorrer un ArrayList con un ListIterator que tiene metodo inverso
        ListIterator<String> lit = al.listIterator(al.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("\nLa lista contiene " + al.size() + " elementos");
        // Eliminamos todos los elementos
        al.clear();

        System.out.println("La lista contiene " + al.size() + " elementos");
    }
}
