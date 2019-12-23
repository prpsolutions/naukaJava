package com.kodilla.ArrayList;

import java.util.ArrayList;

public class DziennikOcen {
    private final ArrayList<Ocena> oceny = new ArrayList<Ocena>();

    public void fillByOceny(){
        Ocena ocena1 = new Ocena(4 , "Piotr Randak");
        Ocena ocena2 = new Ocena(5 , "Michal Zawadzki");
        Ocena ocena3 = new Ocena(5 , "Krzysztof Spadlo");
        Ocena ocena4 = new Ocena(4 , "Michal Kardynalczyk");
        Ocena ocena5 = new Ocena(3 , "Antonii Krysik");
        Ocena ocena6 = new Ocena(4 , "Jan Kowalski");
        Ocena ocena7 = new Ocena(5 , "Stanislaw Nowak");
        Ocena ocena8 = new Ocena(6 , "Waldemar Burczyk");
        Ocena ocena9 = new Ocena(4 , "Andrzej Jurczynski");
        Ocena ocena10 = new Ocena(2 , "Jozef Traczyk");

        oceny.add(ocena1);
        oceny.add(ocena2);
        oceny.add(ocena3);
        oceny.add(ocena4);
        oceny.add(ocena5);
        oceny.add(ocena6);
        oceny.add(ocena7);
        oceny.add(ocena8);
        oceny.add(ocena9);
        oceny.add(ocena10);

        System.out.println("dodano oceny 10 osob do dziennika \n");
    }

    public void wyliczSkrajneWartosci(){
        double najwiekszaLiczba = oceny.get(0).getOcena();
        double najmniejszaLiczba = oceny.get(0).getOcena();
        double suma = 0;

        String pomocnicza = " ";
        String pomocnicza2 = " ";

        for (int i=0; i<oceny.size(); i++) {
            Integer obecnaOcena = oceny.get(i).getOcena();

            if (najmniejszaLiczba > obecnaOcena) {
                najmniejszaLiczba = obecnaOcena;
                pomocnicza = oceny.get(i).getDane();
            } else if (najwiekszaLiczba < obecnaOcena) {
                najwiekszaLiczba = obecnaOcena;
                pomocnicza2 = oceny.get(i).getDane();
            }
        }
        System.out.println("Najmniejsza wartosc w tablicy ocen to");
        System.out.println(najmniejszaLiczba + " Oraz uzyskal ja pan " + pomocnicza + "\n");
        System.out.println("Najwieksza wartosc w tablicy ocen to");
        System.out.println(najwiekszaLiczba + " Oraz uzyskal ja pan " + pomocnicza2 + "\n");
    }

    public void wyliczSrednia() {
        double najwiekszaLiczba = oceny.get(0).getOcena();
        double najmniejszaLiczba = oceny.get(0).getOcena();
        double suma = 0;
        for(int i = 0; i < oceny.size(); i++ ) {
            suma += oceny.get(i).getOcena();
        }

        System.out.println("srednia wartosc ocen pomniejszonych o dwie skrajne wynosi ");
        System.out.println((suma - najwiekszaLiczba - najmniejszaLiczba) / (oceny.size()-2) + " (" + (suma- najwiekszaLiczba - najmniejszaLiczba) + " dzielone przez  " + (oceny.size()-2) + " liczb)");
    }

    public void process(){
        wyliczSkrajneWartosci();
        wyliczSrednia();
    }
}

