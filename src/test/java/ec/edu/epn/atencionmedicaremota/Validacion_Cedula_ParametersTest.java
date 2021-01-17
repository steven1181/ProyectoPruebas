package ec.edu.epn.atencionmedicaremota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith( value = Parameterized.class)
public class Validacion_Cedula_ParametersTest {
    private String cedula;

    @Parameterized.Parameters
    public static Iterable< Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"1726746595"});
        objects.add(new Object[]{"1726668799"});
        objects.add(new Object[]{"1001708070"});
        objects.add(new Object[]{"1001182136"});
        objects.add(new Object[]{"1751489848"});
        return objects;
    }

    public Validacion_Cedula_ParametersTest(String cedula) {
        this.cedula = cedula;
    }

    @Test
    public void given_parameters_when_validate_cedula_is_correct_then_ok(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCedula(cedula);
        assertTrue(vd.validacion_cedula(p.getCedula()));
    }
}

