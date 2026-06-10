package ArrayList2;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Metodos {

    public static void main(String[] a) {
        List lista = Arrays.asList(new String[]{"A", "B", "C", "D"});
        System.out.println("En la lista se encuentra el caracter C " + lista.contains("C"));
        System.out.println("Cantidad de elementos en la lista " + lista.size());
        System.out.println("La lista se encuentra vacia? " + lista.isEmpty());
        //-------------------------------------
        List lista2 = new ArrayList();
        lista2.add("Matias");

        List lista3 = ((List) ((ArrayList) lista2).clone());

        System.out.println("En lista2 tengo " + lista2);
        System.out.println("En lista3 tengo " + lista3);

        lista2.clear();

        System.out.println("Luego de hacer clear tengo en lista2 " + lista2);
        System.out.println("En lista3 tengo " + lista3);
        //--------------------------------------
        ArrayList<String> listado = new ArrayList<String>();

        listado.add("jugador 1");
        listado.add("jugador 2");
        listado.add("jugador 3");
        listado.add("jugador 4");
        listado.add("jugador 5");

        System.out.println("Datos en listado " + listado);

        for (String dato : listado) {
            System.out.println(dato);
        }

        System.out.println("Tranformamos ArrayList en un Array de objetos");
        Object[] objArray = listado.toArray();

        for (Object obj : objArray) {
            System.out.println(obj);
        }
        //---------------------------------------
        List<String> listadoLetras = new ArrayList<String>();

        listadoLetras.add("A");
        listadoLetras.add("A");
        listadoLetras.add("B");
        listadoLetras.add("B");
        listadoLetras.add("B");
        listadoLetras.add("C");

        System.out.println("Datos en listadoLetras " + listadoLetras);

        HashSet<String> miHashSet = new HashSet<String>(listadoLetras);

        List<String> listadoLetrasHash = new ArrayList<String>(miHashSet);

        System.out.println("Datos en listadoLetrasHash ");
        for (Object item : listadoLetrasHash) {
            System.out.println(item);
        }

        //----------------------------------------------------
        ArrayList<String> listadoNros = new ArrayList<String>();

        listadoNros.add("2");
        listadoNros.add("2");
        listadoNros.add("1");
        listadoNros.add("4");
        listadoNros.add("5");
        listadoNros.add("1");
        listadoNros.add("2");

        System.out.println("en el listado se encuentra el 2? " + listadoNros.contains("2"));

        int index = listadoNros.indexOf("4");
        if (index == -1) {
            System.out.println("El nro 4 no se encuentra en el listado");
        } else {
            System.out.println("El nro 4 se encuentra en el indice: " + index);
        }

        int lastIndex = listadoNros.lastIndexOf("1");
        if (lastIndex == -1) {
            System.out.println("El nro 1 no se encuentra en el listado");
        } else {
            System.out.println("El ultimo indice del nro 1 es: " + lastIndex);
        }

        //------------------------------------------
        List listaGatos = new ArrayList();
        for (int i = 0; i < 7; i++) {
            listaGatos.add(new Gato(i));
        }
        Iterator e = listaGatos.iterator();
        while (e.hasNext()) {
            ((Gato) e.next()).id();
        }
    }
}

class Gato {

    private int idGato;

    public Gato(int i) {
        idGato = i;
    }

    public void id() {
        System.out.println("Gato #" + idGato);
    }
}
