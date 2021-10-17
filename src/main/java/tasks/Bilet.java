package tasks;

public enum Bilet {
    ULGOWY_GODZINNY(1.6d,60),
    ULGOWY_CALODNOWY(16d,1440),
    NORMALNY_GODZINNY(3.2d, 60),
    NORMALNY_CALODNIOWY(32d, 1440),
    BRAK_BILETU(0d,0);

    private double cena;
    private int czasJazdyWMin;

    Bilet(double cena, int czasJazdyWMin) {
        this.cena = cena;
        this.czasJazdyWMin = czasJazdyWMin;

    }

    public int pobierzCzasJazdy() {
        return czasJazdyWMin;
    }

    public double getCeneBiletu() {
        return cena;
    }
    public void wyswietlDaneOObiekcie(Bilet bilet){
        System.out.println("Bilet "+bilet+" "+pobierzCzasJazdy()+" minut jazdy, cena: " + getCeneBiletu());
    }
}
