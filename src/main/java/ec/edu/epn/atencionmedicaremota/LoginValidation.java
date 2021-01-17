package ec.edu.epn.atencionmedicaremota;

public class LoginValidation {
    private Login_Sistema_IESS loginSistemaIess;
    public LoginValidation(Login_Sistema_IESS loginSistemaIess) {
        this.loginSistemaIess = loginSistemaIess;
    }
    public boolean log_in (String cedula, String contrasenia){
        LoginResponse response = loginSistemaIess.requestLogin(new LoginRequest(cedula, contrasenia));
        if (response.getStatus() == LoginResponse.LoginStatus.OK)
            return true;
        else
            return false;
    }
}
