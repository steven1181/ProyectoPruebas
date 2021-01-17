package ec.edu.epn.atencionmedicaremota;

public class Enfermedad {
    private String nombre_enfermedad;
    private String codigo_enfermedad;

    public Enfermedad(String nombre_enfermedad, String codigo_enfermedad) {
        this.nombre_enfermedad = nombre_enfermedad;
        this.codigo_enfermedad = codigo_enfermedad;
    }

    public String getNombre_enfermedad() {
        return nombre_enfermedad;
    }

    public String getCodigo_enfermedad() {
        return codigo_enfermedad;
    }
}
