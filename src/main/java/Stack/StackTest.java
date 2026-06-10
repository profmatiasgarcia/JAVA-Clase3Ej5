package Stack;
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
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        //ingresar valores a la pila
        stack.push("1");
        stack.push("2");
        stack.push("3");
        //buscar indice de un elemento en la pila
        int index = stack.search("3");
        System.out.println("el elemento 3 se encuentra en el indice: " + index);
        //observar el elemento en el tope del stack sin sacarlo.
        Object objTop = stack.peek();
        System.out.println("tope de la pila sin eliminar: " + objTop);

        Object obj3 = stack.pop(); //la cadena "3" está en el tope del stack.
        System.out.println("tope de la pila con eliminacion: " + obj3);
        Object obj2 = stack.pop(); //la cadena "2" está en el tope del stack.
        System.out.println("tope de la pila con eliminacion: " + obj2);
        Object obj1 = stack.pop(); //la cadena "1" está en el tope del stack.
        System.out.println("tope de la pila con eliminacion: " + obj1);

    }

}
