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
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {

    private static final String colors[] = {"negro", "amarillo", "verde", "azul", "violeta", "rojo"};
    private static final String colors2[] = {"celeste", "blanco", "marron", "azul", "gris", "rojo"};

    // set up and manipulate LinkedList objects
    public ListTest() {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        // add elements to list link
        for (String color : colors) {
            list1.add(color);
        }

        // add elements to list link2
        for (String color : colors2) {
            list2.add(color);
        }
        System.out.print("Elementos de Lista1: ");
        printList(list1);
        System.out.print("Elementos de Lista2: ");
        printList(list2);

        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        System.out.print("Elementos en Lista1 con Lista2 concatenada: ");
        printList(list1); // print list1 elements

        System.out.println("Elementos de la lista en mayusculas: ");
        convertToUppercaseStrings(list1); // convert to uppercase string
        printList(list1); // print list1 elements

        System.out.print("\nSe eliminan elementos 4 a 6...");
        removeItems(list1, 4, 7); // remove items 4-7 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order
    } // end ListTest constructor

    // output List contents
    public void printList(List< String> list) {
        System.out.print("\nlist: ");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    } // end method printList

    // locate String objects and convert to uppercase
    private void convertToUppercaseStrings(List< String> list) {
        ListIterator< String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next(); // get item                 
            iterator.set(color.toUpperCase()); // convert to uppercase
        } // end while
    } // end method convertToUppercaseStrings

    // obtain sublist and use clear method to delete sublist items
    private void removeItems(List< String> list, int start, int end) {
        list.subList(start, end).clear(); // remove items
    } // end method removeItems

    // print reversed list
    private void printReversedList(List< String> list) {
        ListIterator< String> iterator = list.listIterator(list.size());

        System.out.println("\nLista invertida:");

        // print list in reverse order
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    } // end method printReversedList

    public static void main(String args[]) {
        new ListTest();
    } // end main
} // end class ListTest
