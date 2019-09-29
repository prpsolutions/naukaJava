package com.kodilla.testing.Otomoto;

import java.util.ArrayList;
import java.util.List;

public class SalonSamochodowy {

    public ArrayList<Auto> otoMoto() {

        List<Auto> listaAut = new ArrayList<>();
        List<Auto> listaAudiNaSprzedaz = new ArrayList<>();
        List<Auto> listaBMWNaSprzedaz = new ArrayList<>();
        List<Auto> listaMercedesNaSprzedaz = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listaAut.add(new Auto());
        }

        for (Auto x : listaAut) {
            if (x.getYear() <= 2017 && x.getMarka().startsWith("Au")) {
                listaAudiNaSprzedaz.add(x);
            } else if (x.getYear() <= 2017 && x.getMarka().startsWith("Merc")) {
                listaMercedesNaSprzedaz.add(x);
            } else if (x.getYear() <= 2017 && x.getMarka().startsWith("BM")) {
                listaBMWNaSprzedaz.add(x);
            }
        }

        System.out.println(" \nLista dostepnych używanych Audi na sprzedaz - " + listaAudiNaSprzedaz.size());
        for (Auto z : listaAudiNaSprzedaz) {
            System.out.println(z);
        }

        System.out.println("\nLista dostepnych używanych Mercedesow na sprzedaz - " + listaMercedesNaSprzedaz.size());
        for (Auto z : listaMercedesNaSprzedaz) {
            System.out.println(z);
        }

        System.out.println("\nLista dostepnych używanych BMW na sprzedaz - " + listaBMWNaSprzedaz.size());
        for (Auto z : listaBMWNaSprzedaz) {
            System.out.println(z);
        }
        return new ArrayList<>();

    }
}
