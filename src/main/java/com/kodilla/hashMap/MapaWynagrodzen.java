package com.kodilla.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapaWynagrodzen {
    public static void getListaPlac(){
        Random r = new Random();

        Pracownik obiekt1 = new Pracownik();
        Pracownik obiekt2 = new Pracownik();
        Pracownik obiekt3 = new Pracownik();
        Pracownik obiekt4 = new Pracownik();
        Pracownik obiekt5 = new Pracownik();
        Pracownik obiekt6 = new Pracownik();
        Pracownik obiekt7 = new Pracownik();
        Pracownik obiekt8 = new Pracownik();
        Pracownik obiekt9 = new Pracownik();
        Pracownik obiekt10 = new Pracownik();

        GeneratorWyplat kalkulacja1 = new GeneratorWyplat(obiekt1, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja2 = new GeneratorWyplat(obiekt2, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja3 = new GeneratorWyplat(obiekt3, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja4 = new GeneratorWyplat(obiekt4, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja5 = new GeneratorWyplat(obiekt5, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja6 = new GeneratorWyplat(obiekt6, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja7 = new GeneratorWyplat(obiekt7, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja8 = new GeneratorWyplat(obiekt8, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja9 = new GeneratorWyplat(obiekt9, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));
        GeneratorWyplat kalkulacja10 = new GeneratorWyplat(obiekt10, r.nextInt(60), r.nextInt(60), r.nextInt(60), r.nextInt(60));

        HashMap<Pracownik, GeneratorWyplat> wyplataMiesieczna = new HashMap<Pracownik, GeneratorWyplat>();
        wyplataMiesieczna.put(obiekt1,kalkulacja1);
        wyplataMiesieczna.put(obiekt2,kalkulacja2);
        wyplataMiesieczna.put(obiekt3,kalkulacja3);
        wyplataMiesieczna.put(obiekt4,kalkulacja4);
        wyplataMiesieczna.put(obiekt5,kalkulacja5);
        wyplataMiesieczna.put(obiekt6,kalkulacja6);
        wyplataMiesieczna.put(obiekt7,kalkulacja7);
        wyplataMiesieczna.put(obiekt8,kalkulacja8);
        wyplataMiesieczna.put(obiekt9,kalkulacja9);
        wyplataMiesieczna.put(obiekt10,kalkulacja10);

        for (Map.Entry<Pracownik, GeneratorWyplat> entry : wyplataMiesieczna.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue() + " srednia przepracowanych godzin w tygodniu to - " + entry.getValue().getSredniaGodzin() + "\n " );
        }
    }
}
