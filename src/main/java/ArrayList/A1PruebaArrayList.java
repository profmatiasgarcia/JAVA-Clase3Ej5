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

public class A1PruebaArrayList {

    public static void main(String[] args) {
        ArrayList<String> unArrayList = new ArrayList<>();
//        ArrayList<String> unArrayList = new ArrayList<String>();
        unArrayList.add("hola");
        unArrayList.add(", como");
        unArrayList.add("te");
        unArrayList.add("va");
        unArrayList.add("?");

        for (int i = 0; i < unArrayList.size(); i++) {
            System.out.print(unArrayList.get(i) + " ");
        }

        // cambiamos el 4to elemento
        unArrayList.set(3, "baila");

        System.out.println("\nOtra forma de mostrar los datos");

        for (String text : unArrayList) {
            System.out.print(text + " ");
        }

//        unArrayList.forEach(text -> {
//            System.out.print(text + " ");
//        });
    }
}
