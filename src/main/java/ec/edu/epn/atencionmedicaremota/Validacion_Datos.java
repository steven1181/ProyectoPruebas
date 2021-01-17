package ec.edu.epn.atencionmedicaremota;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validacion_Datos {

    public Validacion_Datos() {
    }

    public boolean validacion_nombre(String nombre) {
        String patron = "^[A-Z]{1}[a-z]+[ ][A-Z]{1}[a-z]+$";
        boolean resultado = nombre.matches(patron);
        return resultado;
    }

    public boolean validacion_cedula(String cedula) {
        try {

            if (cedula.length() == 10){
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    int verificador = Integer.parseInt(cedula.substring(9,10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (0 == verificador)) {
                        return true;
                    }
                    else return (10 - (suma % 10)) == verificador;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception nfe) {
            return false;
        }
    }

    public boolean validacion_correo(String correo) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }

    public boolean validacion_direccion(String direccion) {
        Pattern pattern = Pattern.compile("^[A][v][.][A-Za-z0-9 -]+[y ][A][v][.][A-Za-z0-9 -]+$");

        Matcher mather = pattern.matcher(direccion);
        return mather.find();
    }



}