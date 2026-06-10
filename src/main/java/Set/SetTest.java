package Set;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set setA = new HashSet();
        setA.add("elemento 0");
        setA.add("elemento 1");
        setA.add("elemento 2");

//acceso mediante iterador
        Iterator iterador = setA.iterator();
        while (iterador.hasNext()) {
            String elemento = (String) iterador.next();
            System.out.println("Elemento: " + elemento);
        }
//acceso mediante ciclo for
        for (Object objecto : setA) {
            String elemento = (String) objecto;
            System.out.println("Elemento: " + elemento);

        }
    }
}
