package ec.edu.epn.atencionmedicaremota;

public class LoginRequest {
    private String cedula;
    private String contrasenia;

    public LoginRequest(String cedula, String contrasenia) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
    }

    public String getCedula() {
        return cedula;
    }
    public String getContrasenia() {
        return contrasenia;
    }
}
