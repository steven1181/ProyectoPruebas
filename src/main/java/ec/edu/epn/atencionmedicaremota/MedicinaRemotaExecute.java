package ec.edu.epn.atencionmedicaremota;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;


public class MedicinaRemotaExecute {

    public static void main(String[] args) {

        Vector<Paciente> Pacientes = new Vector<>();
        Vector<Enfermedad> Enfermedades = new Vector<>();
        Pacientes.add(new Paciente("Steven Rivera", "1726746595",
                "Av. Antonio Ante y Av. 10 de Agosto S14-178",
                "steven.rivera@epn.edu.ec", "steven123"));


        Enfermedades.add(new Enfermedad("Infección estomacal", "EST001"));
        Enfermedades.add(new Enfermedad("Infección urinaria", "URI001"));
        Enfermedades.add(new Enfermedad("Gripe", "GR001"));
        Enfermedades.add(new Enfermedad("Resfriado", "RES001"));
        Enfermedades.add(new Enfermedad("Coronavirus", "COVID001"));

        Vector<Sintoma> Sintomas = new Vector<>();
        Sintomas.add(new Sintoma("Aumento de gases", false));
        Sintomas.add(new Sintoma("Colicos y dolor abdominal", false));
        Sintomas.add(new Sintoma("Color anormal de la orina", false));
        Sintomas.add(new Sintoma("Congestion nasal", false));
        Sintomas.add(new Sintoma("Diarrea", false));
        Sintomas.add(new Sintoma("Dolor de cabeza", false));
        Sintomas.add(new Sintoma("Dolor de garganta", false));
        Sintomas.add(new Sintoma("Dolor en el costado o en la espalda", false));
        Sintomas.add(new Sintoma("Dolor al orinar o al mantener relaciones sexuales", false));
        Sintomas.add(new Sintoma("Dolores musculares o corporales", false));
        Sintomas.add(new Sintoma("Escalofríos", false));
        Sintomas.add(new Sintoma("Fiebre", false));
        Sintomas.add(new Sintoma("Garganta irritada", false));
        Sintomas.add(new Sintoma("Malestar general", false));
        Sintomas.add(new Sintoma("Náuseas", false));
        Sintomas.add(new Sintoma("Necesidad urgente y frecuente de orinar", false));
        Sintomas.add(new Sintoma("Ojos llorosos", false));
        Sintomas.add(new Sintoma("Pérdida del apetito", false));
        Sintomas.add(new Sintoma("Pérdida del gusto", false));
        Sintomas.add(new Sintoma("Pérdida del olfato", false));
        Sintomas.add(new Sintoma("Picazón o quemazón en la uretra al orinar", false));
        Sintomas.add(new Sintoma("Sangre en la orina", false));
        Sintomas.add(new Sintoma("Tos con flema", false));
        Sintomas.add(new Sintoma("Tos seca", false));
        Sintomas.add(new Sintoma("Vómitos", false));

        menu_principal(Pacientes,Sintomas,Enfermedades);



    }
    public static void menu_principal(Vector<Paciente> Pacientes,Vector<Sintoma> Sintomas,Vector<Enfermedad> Enfermedades) {

        System.out.println("===============================================================");
        System.out.println("==================== ATENCION MEDICA REMOTA ===================");
        System.out.println("===============================================================");
        System.out.println("1. Ingresar");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");
        System.out.println("Ingrese el numero de la opcion que desea realizar: ");
        System.out.println("Aqui el paciente selecciona la opcion 2. Registrarse\n");

        Validacion_Datos vd = new Validacion_Datos();
        System.out.println("Ingrese su Nombre: ");
        System.out.println("El paciente ingresa Alexander Vargas");
        String nombre = "Alexander Vargas";
        boolean vnombre = vd.validacion_nombre(nombre);
        if(!vnombre){
            System.out.println("nombre no valido");
        }
        System.out.println("Ingrese su cedula");
        System.out.println("El paciente ingresa 1001182136 ");
        String cedula_ = "1001182136";
        boolean vcedula = vd.validacion_cedula(cedula_);
        if (!vcedula){
            System.out.println("\nCedula no valida");
        }
        System.out.println("Ingrese su direccion");
        System.out.println("El paciente ingresa Av. Antonio Ante y Av. 10 de Agosto S14-178");
        String direccion = "Av. Antonio Ante y Av. 10 de Agosto S14-178";
        boolean vdireccion = vd.validacion_direccion(direccion);
        if (!vdireccion){
            System.out.println("\nDireccion no valida");
        }
        System.out.println("Ingrese su correo");
        System.out.println("El paciente ingresa alexander.vargas@epn.edu.ec");
        String correo = "alexander.vargas@epn.edu.ec";
        boolean vcorreo = vd.validacion_correo(correo);
        if (!vcorreo){
            System.out.println("\nCorreo no valido");
        }
        System.out.println("Ingrese su contraseña");
        System.out.println("El paciente ingresa alexander123");
        String contrasenia_ = "alexander123";

        if (vnombre==true && vcedula==true && vdireccion==true && vcorreo==true){
            agregar_pacientes(Pacientes,nombre,cedula_,direccion,correo,contrasenia_);
        }

        System.out.println("===============================================================");
        System.out.println("==================== ATENCION MEDICA REMOTA ===================");
        System.out.println("===============================================================");
        System.out.println("1. Ingresar");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");
        System.out.println("Ingrese el numero de la opcion que desea realizar: ");
        System.out.println("Aqui el paciente selecciona la opcion 1. Ingresar\n");
        System.out.println("Ingrese su cedula: ");
        System.out.println("El paciente ingresa la cedula 1001182136");
        String cedula = "1001182136";
        System.out.println("Ingrese su contrasenia: ");
        System.out.println("El paciente ingresa la contraseña: alexander123");
        String contrasenia = "alexander123";
        System.out.println("El sistema valida la informacion y muestra la pagina de inicio y los sintomas");
        int indice_paciente = validacion_paciente(Pacientes, cedula, contrasenia);

        if (indice_paciente != (-1)) {
            System.out.println(Pacientes.elementAt(indice_paciente).imprimir_detalles_paciente());
            //Imprimo sintomas y selecciono los sintomas
            Tratamiento tratamiento = new Tratamiento();
            tratamiento.Tratar(Sintomas);
            //Diagnosticar enfermedad
            int indicador_enfermedad = tratamiento.diagnosticar_enfermedad(Sintomas);
            System.out.println("===============================================================");
            System.out.println(tratamiento.emitir_receta(indicador_enfermedad,Enfermedades));
            System.out.println("===============================================================");
        }
    }


    public static int validacion_paciente(Vector<Paciente> Pacientes ,String cedula, String contrasenia) {
        for (int i = 0; i < Pacientes.size(); i++) {
            if (Pacientes.elementAt(i).getCedula().equals(cedula) && Pacientes.elementAt(i).getContrasenia().equals(contrasenia))
                return i;
        }
        return -1;
    }

    public static void impresion_enfermedad(Vector<Enfermedad> Enfermedades, int indice_enfermedad){
        System.out.println("La enfermadad que tiene es: "+Enfermedades.elementAt(indice_enfermedad-1).getNombre_enfermedad());;
    }

    public static void agregar_pacientes(Vector<Paciente> Pacientes,String nombre,String cedula, String direccion,
                                         String correo, String contrasenia){
        Pacientes.add(new Paciente(nombre,cedula,direccion,correo,contrasenia));
    }
}
