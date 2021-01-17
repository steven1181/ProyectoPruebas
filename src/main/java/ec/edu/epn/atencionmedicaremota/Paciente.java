package ec.edu.epn.atencionmedicaremota;

public class Paciente {
    private String nombre;
    private String cedula;
    private String direccion_domiciliaria;
    private String correo_electronico;
    private String contrasenia;

    public Paciente(String cedula) {
        this.cedula = cedula;
    }

    public Paciente() {
    }

    public Paciente(String nombre, String cedula, String direccion_domiciliaria,
                    String correo_electronico, String contrasenia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion_domiciliaria = direccion_domiciliaria;
        this.correo_electronico = correo_electronico;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion_domiciliaria() {
        return direccion_domiciliaria;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion_domiciliaria(String direccion_domiciliaria) {
        this.direccion_domiciliaria = direccion_domiciliaria;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String imprimir_detalles_paciente() {
        return "=======================================================\n" +
                "====================== Bienvenido =====================\n"
                +"Nombre del paciente: "+this.nombre+
                "\nCedula de identidad del paciente: "+this.cedula+
                "\n=======================================================\n";

    }


}
