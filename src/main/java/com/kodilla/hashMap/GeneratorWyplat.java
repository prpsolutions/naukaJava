package com.kodilla.hashMap;

public class GeneratorWyplat {
    private Pracownik pracownik;
    private int liczbaGodzinWeek1;
    private int liczbaGodzinWeek2;
    private int liczbaGodzinWeek3;
    private int liczbaGodzinWeek4;
    private int wyplataPracownika;
    private int liczbaGodzinMiesiac;


    public GeneratorWyplat(Pracownik pracownik , int liczbaGodzinWeek1, int liczbaGodzinWeek2, int liczbaGodzinWeek3, int liczbaGodzinWeek4){
        this.pracownik = pracownik;
        this.liczbaGodzinWeek1 = liczbaGodzinWeek1;
        this.liczbaGodzinWeek2 = liczbaGodzinWeek2;
        this.liczbaGodzinWeek3 = liczbaGodzinWeek3;
        this.liczbaGodzinWeek4 = liczbaGodzinWeek4;
        liczbaGodzinMiesiac = liczbaGodzinWeek1 + liczbaGodzinWeek2 + liczbaGodzinWeek3 + liczbaGodzinWeek4;

        if (pracownik.getStanowisko() == "Pomocnik"){
            wyplataPracownika = GeneratorWyplat.wyplataPomocnika(liczbaGodzinMiesiac);

        } else if (pracownik.getStanowisko() == "Monter"){
            wyplataPracownika = GeneratorWyplat.wyplataMontera(liczbaGodzinMiesiac);

        } else if(pracownik.getStanowisko() == "Supervisor"){
            wyplataPracownika = GeneratorWyplat.wyplataSupervisora(liczbaGodzinMiesiac);
        }
    }

    public static int wyplataPomocnika(int liczbaGodzinMiesiac){
        int wyplataP = 10*liczbaGodzinMiesiac;
        return wyplataP;
    }
    public static int wyplataMontera(int liczbaGodzinMiesiac){
        int wyplataM = 20*liczbaGodzinMiesiac;
        return wyplataM;
    }
    public static int wyplataSupervisora(int liczbaGodzinMiesiac){
        int wyplataS = 30*liczbaGodzinMiesiac;
        return wyplataS;
    }

    public void getInfo(){
        System.out.println(this.pracownik.getDane() +" ktory pracuje na stanowisku " + this.pracownik.getStanowisko() + " w tym miesiacu otrzyma za przepracowane " + (liczbaGodzinWeek1 + liczbaGodzinWeek2 + liczbaGodzinWeek3 + liczbaGodzinWeek4) + " godzin " + this.wyplataPracownika + " PLN \n");
    }

    public int getWyplatawyplataPracownika(){
        return wyplataPracownika;
    }
    public int getLiczbaGodzinWeek1(){
        return liczbaGodzinWeek1;
    }
    public int getLiczbaGodzinWeek2(){
        return liczbaGodzinWeek2;
    }
    public int getLiczbaGodzinWeek3(){
        return liczbaGodzinWeek3;
    }
    public int getLiczbaGodzinWeek4(){
        return liczbaGodzinWeek4;
    }

    public double getSredniaGodzin(){
        return (liczbaGodzinWeek1 + liczbaGodzinWeek2 + liczbaGodzinWeek3 + liczbaGodzinWeek4)/4;
    }
    public int getSumaGodzin(){
        return liczbaGodzinWeek1 + liczbaGodzinWeek2 + liczbaGodzinWeek3 + liczbaGodzinWeek4;
    }

    @Override
    public String toString(){
        return "" + this.pracownik.getDane() +" ktory pracuje na stanowisku " + this.pracownik.getStanowisko() + " w tym miesiacu otrzyma za przepracowane " + (liczbaGodzinWeek1 + liczbaGodzinWeek2 + liczbaGodzinWeek3 + liczbaGodzinWeek4) + " godzin " + this.wyplataPracownika + " PLN \n";
    }
}
