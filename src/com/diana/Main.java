package com.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creamos 4 casos de prueba validos
        String entrada1 = "Acaso hubo buhos aca";
        String entrada2 = "Querido muerto esta tarde llegamos";
        String entrada3 = "hmmmm";
        String entrada4 = "SInoONis";
        String entrada5 = "XXX";

        //los guardamos en un arraylist
        ArrayList<String> entradas = new ArrayList<>();
        Collections.addAll(entradas, entrada1, entrada2, entrada3, entrada4);

        //y lo imprimo
        System.out.println("ENTRADA");
        System.out.print(entrada1+"\n"+ entrada2+"\n"+ entrada3+"\n"+ entrada4+"\n");

        System.out.println(" ");
        System.out.println("SALIDA");
        for (String e : entradas) {
            //para quitar todos los espacios en blanco del princio, final y entre palabras
            e = e.replaceAll("\\s+", "");
            //transformamos todas las letras en minusculas
            e = e.toLowerCase();

            char[] letters = e.toCharArray();
            String reves = "";
            for (int i = letters.length - 1; i >= 0; i--) {
               // System.out.print(letters[i]);
                reves+=letters[i];
            }
            //System.out.println(reves);

            if (e.equals(reves)) {
            //Objects.equals(e, reves)
                System.out.println("si");
            } else {
                System.out.println("no");
            }

        }
    }
}
