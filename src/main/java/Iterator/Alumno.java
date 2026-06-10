
package Iterator;

public class Alumno {

    private int legajo;
    private String nombre;

    public Alumno(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return legajo + " - " + nombre;
    }
}
