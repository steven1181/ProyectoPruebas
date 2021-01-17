package ec.edu.epn.atencionmedicaremota;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class TratamientoTest {

    Vector<Enfermedad> Enfermedades = new Vector<>();
    Vector<Sintoma> Sintomas = new Vector<>();
    @Test
    public void given_nombre_and_cedula_when_print_on_screen_is_correct_then_ok(){
        Paciente p = new Paciente();
        p.setNombre("Steven Rivera");
        p.setCedula("1726746595");

        String expected = "=======================================================\n" +
                "====================== Bienvenido =====================\n"
                +"Nombre del paciente: Steven Rivera\n"+
                "Cedula de identidad del paciente: 1726746595\n"+
                "=======================================================\n";
        String actual = p.imprimir_detalles_paciente();
        assertEquals(expected,actual);
    }

    @Test
    public void given_sintoma_when_it_is_selected_then_ok(){
        Vector<Sintoma> Sintomas = new Vector<>();
        agregar_sintomas(Sintomas);
        Tratamiento t = new Tratamiento();
        int indice_sintoma = 6;
        t.marcar_sintoma(Sintomas,indice_sintoma);
        boolean actual = Sintomas.elementAt(indice_sintoma).isSeleccion_sintoma();

        assertTrue(actual);
    }

    @Test
    public  void given_sintomas_when_this_are_selected_then_diagnosticar_enfermedad(){
        Vector<Sintoma> Sintomas = new Vector<>();
        Vector<Enfermedad> Enfermedades = new Vector<>();
        agregar_sintomas(Sintomas);
        agregar_enfermedades(Enfermedades);
        Tratamiento t = new Tratamiento();
        t.marcar_sintoma(Sintomas,3);
        t.marcar_sintoma(Sintomas,12);
        t.marcar_sintoma(Sintomas,16);
        t.marcar_sintoma(Sintomas,22);
        int indice_enfermedad = t.diagnosticar_enfermedad(Sintomas)-1;

        String expected = "Resfriado";
        String actual = Enfermedades.elementAt(indice_enfermedad).getNombre_enfermedad();
        assertEquals(expected,actual);
    }

    @Test
    public void given_receta_when_print_on_screen_then_ok(){
        Vector<Sintoma> Sintomas = new Vector<>();
        Vector<Enfermedad> Enfermedades = new Vector<>();
        agregar_sintomas(Sintomas);
        agregar_enfermedades(Enfermedades);
        Tratamiento t = new Tratamiento();
        t.marcar_sintoma(Sintomas,3);
        t.marcar_sintoma(Sintomas,12);
        t.marcar_sintoma(Sintomas,16);
        t.marcar_sintoma(Sintomas,22);
        int indice_enfermedad = t.diagnosticar_enfermedad(Sintomas);

        String expected = "La posible enfermedad que tiene es: " + "Resfriado" +
                "\nEl tratamiento es el siguiente: " + "\nOseltamivir 200 mg comprimidos 1 (una) caja\n" +
                "Tomar vía oral 1 (uno) cada 12 horas por 7 (siete)días\n" +
                "Ibuprofeno 150 mg comprimidos 1 (una) caja\n" +
                "Tomar vía oral 1 (uno) cada 8 horas por 7 (siete)días\n" +
                "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                "\nGracias por preferirnos";

        String actual = t.emitir_receta(indice_enfermedad,Enfermedades);
        assertEquals(expected,actual);
    }

    public void agregar_enfermedades (Vector<Enfermedad> Enfermedades){
        Enfermedades.add(new Enfermedad("Infección estomacal", "EST001"));
        Enfermedades.add(new Enfermedad("Infección urinaria", "URI001"));
        Enfermedades.add(new Enfermedad("Gripe", "GR001"));
        Enfermedades.add(new Enfermedad("Resfriado", "RES001"));
        Enfermedades.add(new Enfermedad("Coronavirus", "COVID001"));
    }

    public void agregar_sintomas (Vector<Sintoma> Sintomas){
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
    }



}