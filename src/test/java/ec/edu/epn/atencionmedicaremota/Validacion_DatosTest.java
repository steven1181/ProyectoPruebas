package ec.edu.epn.atencionmedicaremota;

import org.junit.Test;

import static org.junit.Assert.*;

public class Validacion_DatosTest {


    @Test
    public void given_nombre_paciente_when_validation_is_correct_then_ok(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setNombre("Steven Rivera");
        String nombre_paciente = p.getNombre();
        assertTrue(vd.validacion_nombre(nombre_paciente));
    }

    @Test
    public void given_cedula_when_validation_is_correct_then_ok(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCedula("1001182136");
        String cedula = p.getCedula();
        assertTrue(vd.validacion_cedula(cedula));
    }

    @Test
    public  void given_direccion_domiciliaria_when_validation_is_correct_then_ok(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setDireccion_domiciliaria("Av. Antonio Ante y Av. 10 de Agosto S14-178");
        String direccion_domiciliaria = p.getDireccion_domiciliaria();
        assertTrue(vd.validacion_direccion(direccion_domiciliaria));
    }

    @Test
    public void given_correo_when_validation_is_correct_then_ok(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCorreo_electronico("steven.rivera@epn.edu.ec");
        String correo = p.getCorreo_electronico();
        assertTrue(vd.validacion_correo(correo));
    }

    @Test(timeout = 10)
    public void given_cedula_when_validate_then_timeout(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCedula("1001182136");
        String cedula = p.getCedula();
        assertTrue(vd.validacion_cedula(cedula));
    }

    @Test
    public void given_cedula_when_validation_is_incorrect_then_error(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCedula("2387468282");
        String cedula = p.getCedula();
        assertFalse(vd.validacion_cedula(cedula));
    }

    @Test
    public void given_cedula_and_password_when_identical_expected_values_then_ok() {
        Paciente p = new Paciente();
        String cedula_esperada = "1726746595";
        String contrasenia_esperada = "javier123";
        String cedula_actual = "1726746595";
        String contrasenia_actual = "javier123";
        p.setCedula(cedula_esperada);
        p.setContrasenia(contrasenia_esperada);
        String [] credenciales_esperadas = {p.getCedula(),p.getContrasenia()};
        String [] credenciales_actuales = {cedula_actual,contrasenia_actual};
        assertArrayEquals(credenciales_esperadas,credenciales_actuales);
    }

    @Test
    public void given_correo_when_validation_is_incorrect_then_error(){
        Paciente p = new Paciente();
        Validacion_Datos vd = new Validacion_Datos();
        p.setCorreo_electronico("steven.@epn");
        String correo = p.getCorreo_electronico();
        assertFalse(vd.validacion_correo(correo));
    }
}