package ec.edu.epn.atencionmedicaremota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class Login_Sistema_IESSTest {

    @Test
    public void given_nombre_and_contrasenia_when_is_correct_then_ok(){
        Login_Sistema_IESS loginSistemaIess = Mockito.mock(Login_Sistema_IESS.class);
        LoginValidation validation = new LoginValidation(loginSistemaIess);

        Mockito.when(loginSistemaIess.requestLogin(Mockito.any()))
                .thenReturn(new LoginResponse(LoginResponse.LoginStatus.OK));

        assertTrue(validation.log_in("1726746595","javier12345"));
    }

    @Test
    public void given_nombre_and_contrasenia_when_is_incorrect_then_error(){
        Login_Sistema_IESS loginSistemaIess = Mockito.mock(Login_Sistema_IESS.class);
        LoginValidation validation = new LoginValidation(loginSistemaIess);

        Mockito.when(loginSistemaIess.requestLogin(Mockito.any()))
                .thenReturn(new LoginResponse(LoginResponse.LoginStatus.ERROR));

        assertFalse(validation.log_in("1726746595","steven123"));
    }

}