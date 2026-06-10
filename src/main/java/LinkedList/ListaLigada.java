package LinkedList;
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
import java.util.*;

public class ListaLigada {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int num;
        int op;
        LinkedList lista = new LinkedList();

        do {

            System.out.println("\t Menú \t");
            System.out.println("Operaciones con listas");
            System.out.println("1.- Insertar al principio");
            System.out.println("2.- Insertar al final");
            System.out.println("3.- Borrar al principio");
            System.out.println("4.- Borrar al final");
            System.out.println("5.- Mostrar la lista");
            System.out.println("6.- Borrar toda la lista");
            System.out.println("7.- Salir");
            System.out.println("\n");

            System.out.println("Elija la operación que desee");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Inserte numero");
                    num = leer.nextInt();
                    lista.addFirst(num); //agrega al principio
                    break;

                case 2:
                    System.out.println("Inserte numero");
                    num = leer.nextInt();
                    lista.addLast(num); //agrega al final
                    break;

                case 3:
                    System.out.println("Se borrara el primer nodo");
                    lista.removeFirst(); //borra primero
                    break;

                case 4:
                    System.out.println("Se borrara el nodo final");
                    lista.removeLast(); //borra ultimo
                    break;

                case 5:
                    System.out.println("La lista es la siguiente");
                    System.out.print(lista);
                    break;

                case 6:
                    System.out.println("Se borraran todos los elementos de la lista");
                    lista.clear(); //borra todos los nodos
                    break;

                case 7:
                    System.out.println("Al rato");
                    break;
            }

        } while (op != 7);
    }
}
