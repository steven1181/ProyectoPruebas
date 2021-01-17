package ec.edu.epn.atencionmedicaremota;

public class Sintoma {
    private String nombre_sintoma;
    private boolean seleccion_sintoma;

    public Sintoma() {
    }

    public Sintoma(String nombre_sintoma, boolean seleccion_sintoma) {
        this.nombre_sintoma = nombre_sintoma;
        this.seleccion_sintoma = seleccion_sintoma;
    }

    public String getNombre_sintoma() {
        return nombre_sintoma;
    }

    public boolean isSeleccion_sintoma() {
        return seleccion_sintoma;
    }

    public void setSeleccion_sintoma(boolean seleccion_sintoma) {
        this.seleccion_sintoma = seleccion_sintoma;
    }

    public void setNombre_sintoma(String nombre_sintoma) {
        this.nombre_sintoma = nombre_sintoma;
    }
}
