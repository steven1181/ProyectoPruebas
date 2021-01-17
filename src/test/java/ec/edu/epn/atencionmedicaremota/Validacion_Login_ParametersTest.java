package ec.edu.epn.atencionmedicaremota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith( value = Parameterized.class)
public class Validacion_Login_ParametersTest {

    private final String cedula_actual;
    private final String contrasenia_actual;
    private final String cedula_esperada;
    private final String contrasenia_esperada;
    @Parameterized.Parameters

    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"1726746595","andres12345","1726746595","andres12345"});
        objects.add(new Object[]{"1726668799","asdf12345","1726668799","asdf12345"});
        objects.add(new Object[]{"1001182136","password","1001182136","password"});
        objects.add(new Object[]{"1751489848","contrasenia","1751489848","contrasenia"});

        return objects;
    }

    public Validacion_Login_ParametersTest(String cedula_actual, String contrasenia_actual,
                                           String cedula_esperada, String contrasenia_esperada) {
        this.cedula_actual = cedula_actual;
        this.contrasenia_actual = contrasenia_actual;
        this.cedula_esperada = cedula_esperada;
        this.contrasenia_esperada = contrasenia_esperada;
    }

    @Test
    public void given_parameters_when_validate_cedula_is_correct_then_ok() {
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCedula(cedula_esperada);
        p.setContrasenia(contrasenia_esperada);
        String [] credenciales_esperadas = {p.getCedula(),p.getContrasenia()};
        String [] credenciales_actuales = {cedula_actual,contrasenia_actual};
        assertArrayEquals(credenciales_esperadas,credenciales_actuales);
    }
}