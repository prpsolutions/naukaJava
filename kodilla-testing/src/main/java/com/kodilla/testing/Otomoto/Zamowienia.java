package com.kodilla.testing.Otomoto;

import java.util.HashMap;
import java.util.Map;

public class Zamowienia {
    HashMap<Kierowcy, Auto> zamowienie = new HashMap<>();

    public HashMap<Kierowcy , Auto> makeZamowienie(){
        for(int i = 0; i < 100; i++) {
            zamowienie.put(new Kierowcy(), new Auto());
        }

        System.out.println(zamowienie.size());

        for(Map.Entry<Kierowcy, Auto> entry : zamowienie.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            System.out.println("ZAMOWIENIE DLA PANA - " + key + " wybrany samochod to " + value);
        }
        return new HashMap<Kierowcy, Auto>(zamowienie);
    }
}
