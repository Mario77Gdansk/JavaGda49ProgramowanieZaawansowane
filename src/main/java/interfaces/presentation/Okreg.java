package interfaces.presentation;

public class Okreg implements Powiekszalny {
    private int szerokosc, wysokosc;

    public Okreg(int szerokosc, int wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    public int pobierzSzerokosc() {
        return this.szerokosc;
    }

    @Override
    public int pobierzWysokosc() {
        return this.wysokosc;
    }

    @Override
    public void powiekszO(int wymiar) {

    }

    @Override
    public void poszerzO(int wymiar) {

    }
}
