package Map;

public class Alumno {

    private int legajo;
    private String nombre;
    private String apellido;

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return legajo + " - " + nombre + " " + apellido;
    }
}
