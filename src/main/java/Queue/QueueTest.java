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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue colaA = new LinkedList();

        colaA.add("elemento 1");
        colaA.add("elemento 2");
        colaA.add("elemento 3");

        Object firstElement = colaA.element();
        System.out.println("Primer elemento de la Cola A: " + firstElement);

        //acceso con iterador
        Iterator iterador = colaA.iterator();
        while (iterador.hasNext()) {
            String elemento = (String) iterador.next();
            System.out.println("elemento: " + elemento);
        }
        //eliminar un elemento
        Object primerElemento = colaA.remove();

        //acceso con ciclo for
        System.out.println("---------------------");
        for (Object objecto : colaA) {
            String elemento = (String) objecto;
            System.out.println("elemento: " + elemento);
        }

    }
}
