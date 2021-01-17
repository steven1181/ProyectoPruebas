package ec.edu.epn.atencionmedicaremota;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Tratamiento {
    public void Tratar(Vector<Sintoma> Sintomas) {
        boolean salir = false;
        imprimir_sintomas(Sintomas);
        System.out.println("Ingrese el numero del sintoma que padece (uno por uno)");
        System.out.println("El paciente ingresa los sintomas 4, 13, 17 y 23");
        Seleccion_sintoma(Sintomas, salir, 4);
        Seleccion_sintoma(Sintomas, salir, 13);
        Seleccion_sintoma(Sintomas, salir, 17);
        Seleccion_sintoma(Sintomas, salir, 23);
        salir = true;

    }

    public int diagnosticar_enfermedad(Vector<Sintoma> sintomas) {
        final boolean aumento_gases = sintomas.elementAt(0).isSeleccion_sintoma();
        final boolean colicos = sintomas.elementAt(1).isSeleccion_sintoma();
        final boolean color_anormal_orina = sintomas.elementAt(2).isSeleccion_sintoma();
        final boolean congestion_nasal = sintomas.elementAt(3).isSeleccion_sintoma();
        final boolean diarrea = sintomas.elementAt(4).isSeleccion_sintoma();
        final boolean dolor_cabeza = sintomas.elementAt(5).isSeleccion_sintoma();
        final boolean dolor_garganta = sintomas.elementAt(6).isSeleccion_sintoma();
        final boolean dolor_costado_espalda = sintomas.elementAt(7).isSeleccion_sintoma();
        final boolean dolor_orinar = sintomas.elementAt(8).isSeleccion_sintoma();
        final boolean dolor_muscular = sintomas.elementAt(9).isSeleccion_sintoma();
        final boolean escalofrios = sintomas.elementAt(10).isSeleccion_sintoma();
        final boolean fiebre = sintomas.elementAt(11).isSeleccion_sintoma();
        final boolean garganta_irritada = sintomas.elementAt(12).isSeleccion_sintoma();
        final boolean malestar_general = sintomas.elementAt(13).isSeleccion_sintoma();
        final boolean nauseas = sintomas.elementAt(14).isSeleccion_sintoma();
        final boolean frecuente_orinar = sintomas.elementAt(15).isSeleccion_sintoma();
        final boolean ojos_llorosos = sintomas.elementAt(16).isSeleccion_sintoma();
        final boolean perdida_apetito = sintomas.elementAt(17).isSeleccion_sintoma();
        final boolean perdida_gusto = sintomas.elementAt(18).isSeleccion_sintoma();
        final boolean perdida_olfato = sintomas.elementAt(19).isSeleccion_sintoma();
        final boolean picazon_orinar = sintomas.elementAt(20).isSeleccion_sintoma();
        final boolean sangre_orina = sintomas.elementAt(21).isSeleccion_sintoma();
        final boolean tos_flema = sintomas.elementAt(22).isSeleccion_sintoma();
        final boolean tos_seca = sintomas.elementAt(23).isSeleccion_sintoma();
        final boolean vomitos = sintomas.elementAt(24).isSeleccion_sintoma();
        if (colicos == true && diarrea == true
                && vomitos == true && dolor_cabeza == true
                && aumento_gases == true && perdida_apetito == true
                && fiebre == true) {
            return 1;
        }

        if (frecuente_orinar == true && picazon_orinar == true
                && dolor_orinar == true && color_anormal_orina == true
                && tos_flema == true && escalofrios == true
                && fiebre == true && vomitos == true
                && nauseas == true && dolor_costado_espalda == true) {
            return 2;
        }

        if (fiebre == true && dolor_cabeza == true
                && escalofrios == true && tos_seca == true
                && dolor_garganta == true && dolor_muscular == true
                && malestar_general == true) {
            return 3;
        }

        if (congestion_nasal == true && garganta_irritada == true
                && ojos_llorosos == true && tos_flema == true) {
            return 4;
        }

        if (fiebre == true && dolor_cabeza == true
                && escalofrios == true && tos_seca == true
                && dolor_muscular == true && malestar_general == true
                && perdida_olfato == true && perdida_gusto == true) {
            return 5;
        } else
            return 6;
    }

    public String emitir_receta(int indicador_enfermedad_diagnosticada, Vector<Enfermedad> Enfermedades){
        if(indicador_enfermedad_diagnosticada==1){
            return "La posible enfermedad que tiene es: " + Enfermedades.elementAt(indicador_enfermedad_diagnosticada-1).getNombre_enfermedad() +
                    "\nEl tratamiento es el siguiente: " + "\nLansoprazol 500mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 6 horas por 14 (catorce)días\n" +
                    "Amoxicilina 250 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 12 horas por 14 (catorce)días\n" +
                    "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                    "\nGracias por preferirnos";
        }
        if(indicador_enfermedad_diagnosticada==2){
            return "La posible enfermedad que tiene es: " + Enfermedades.elementAt(indicador_enfermedad_diagnosticada-1).getNombre_enfermedad() +
                    "\nEl tratamiento es el siguiente: " + "\nCefalexina 500mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 8 horas por 7 (siete)días\n" +
                    "Fosfomicina 500 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 12 horas por 7 (siete)días\n" +
                    "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                    "\nGracias por preferirnos";
        }
        if(indicador_enfermedad_diagnosticada==3){
            return "La posible enfermedad que tiene es: " + Enfermedades.elementAt(indicador_enfermedad_diagnosticada-1).getNombre_enfermedad() +
                    "\nEl tratamiento es el siguiente: " + "\nZanamivir 200 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 12 horas por 7 (siete)días\n" +
                    "Ibuprofeno 150 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 8 horas por 7 (siete)días\n" +
                    "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                    "\nGracias por preferirnos";
        }
        if(indicador_enfermedad_diagnosticada==4){
            return "La posible enfermedad que tiene es: " + Enfermedades.elementAt(indicador_enfermedad_diagnosticada-1).getNombre_enfermedad() +
                    "\nEl tratamiento es el siguiente: " + "\nOseltamivir 200 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 12 horas por 7 (siete)días\n" +
                    "Ibuprofeno 150 mg comprimidos 1 (una) caja\n" +
                    "Tomar vía oral 1 (uno) cada 8 horas por 7 (siete)días\n" +
                    "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                    "\nGracias por preferirnos";
        }
        if(indicador_enfermedad_diagnosticada==5){
            return "La posible enfermedad que tiene es: " + Enfermedades.elementAt(indicador_enfermedad_diagnosticada-1).getNombre_enfermedad() +
                    "\nEl tratamiento es el siguiente: " + "\nPor el momento no existe un medicamento que pueda tratar esta enfermedad.\n" +
                    "Para llevar de mejor manera la enfermedad se recomienda:\n" +
                    "Descansar, beber muchos líquidos y comer alimentos nutritivos.\n" +
                    "Permanezca en una habitación separada de los demás miembros de su familia.\n" +
                    "\nPuede retirar la medicina en cualquier centro de salud del IESS" +
                    "\nGracias por preferirnos";
        }
        if(indicador_enfermedad_diagnosticada==6){
            return "No ha sido posible emitir un tratamiento acerquese a una casa de salud mas cercana";
        }
        return "No ha sido posible emitir un tratamiento acerquese a una casa de salud mas cercana";
    }

    public void imprimir_sintomas(Vector<Sintoma> sintomas) {
        System.out.println("=======================================================");
        System.out.println("================== LISTA DE SINTOMAS ==================");
        System.out.println("=======================================================");
        for(int i=0; i<sintomas.size(); i++){
            System.out.println((i+1)+". " +  sintomas.elementAt(i).getNombre_sintoma());
        }
        System.out.println("26. TERMINAR SELECCION DE SINTOMAS");
    }

    public boolean Seleccion_sintoma(Vector<Sintoma> sintomas, boolean salir_seleccion_sintomas, int opcion_sintoma) {
        switch (opcion_sintoma) {
            case 1:
                marcar_sintoma(sintomas, 0);
                break;
            case 2:
                marcar_sintoma(sintomas, 1);
                break;
            case 3:
                marcar_sintoma(sintomas, 2);
                break;
            case 4:
                marcar_sintoma(sintomas, 3);
                break;
            case 5:
                marcar_sintoma(sintomas, 4);
                break;
            case 6:
                marcar_sintoma(sintomas, 5);
                break;
            case 7:
                marcar_sintoma(sintomas, 6);
                break;
            case 8:
                marcar_sintoma(sintomas, 7);
                break;
            case 9:
                marcar_sintoma(sintomas, 8);
                break;
            case 10:
                marcar_sintoma(sintomas, 9);
                break;
            case 11:
                marcar_sintoma(sintomas, 10);
                break;
            case 12:
                marcar_sintoma(sintomas, 11);
                break;
            case 13:
                marcar_sintoma(sintomas, 12);
                break;
            case 14:
                marcar_sintoma(sintomas, 13);
                break;
            case 15:
                marcar_sintoma(sintomas, 14);
                break;
            case 16:
                marcar_sintoma(sintomas, 15);
                break;
            case 17:
                marcar_sintoma(sintomas, 16);
                break;
            case 18:
                marcar_sintoma(sintomas, 17);
                break;
            case 19:
                marcar_sintoma(sintomas, 18);
                break;
            case 20:
                marcar_sintoma(sintomas, 19);
                break;
            case 21:
                marcar_sintoma(sintomas, 20);
                break;
            case 22:
                marcar_sintoma(sintomas, 21);
                break;
            case 23:
                marcar_sintoma(sintomas, 22);
                break;
            case 24:
                marcar_sintoma(sintomas, 23);
                break;
            case 25:
                marcar_sintoma(sintomas, 24);
                break;
            case 26:
                salir_seleccion_sintomas = true;
                break;

            default:
                System.out.println("Seleccion invalida");
        }
        return salir_seleccion_sintomas;
    }

    public void marcar_sintoma(Vector<Sintoma> sintomas, int indice_sintoma){
        sintomas.elementAt(indice_sintoma).setSeleccion_sintoma(true);
    }



}
