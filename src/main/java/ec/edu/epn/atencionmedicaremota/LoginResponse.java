package ec.edu.epn.atencionmedicaremota;

public class LoginResponse {
    enum LoginStatus{
        OK,ERROR
    }
    private LoginStatus status;
    public LoginResponse(LoginStatus status){
        this.status = status;
    }
    public LoginStatus getStatus() {
        return status;
    }
}
