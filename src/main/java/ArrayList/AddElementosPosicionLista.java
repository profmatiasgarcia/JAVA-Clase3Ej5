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

public class AddElementosPosicionLista {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Matias");
        al.add("Angie");
        al.add("Brianna");

        System.out.println("--- ArrayList Inicial ---");
//        for (int x = 0; x < al.size(); x++) {
//            System.out.println(al.get(x));
//        }
        for (String txt : al) {
            System.out.println(txt);
        }

        System.out.println("--- ArrayList tras insertar elementos ---");

        al.add(1, "Blanca");
        al.add(0, "Roberto");

//        for (int x = 0; x < al.size(); x++) {
//            System.out.println(al.get(x));
//        }
        al.forEach(txt -> {
            System.out.println(txt);
        });

    }

}
