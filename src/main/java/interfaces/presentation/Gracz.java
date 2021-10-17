package interfaces.presentation;

public class Gracz implements Ruchowy{
    int x,y,predkosc;

    public Gracz(int predkosc) {
        this.predkosc = predkosc;
    }

    @Override
    public void doGory() {
        y+=predkosc;
    }

    @Override
    public void wDol() {
        y-=predkosc;
    }

    @Override
    public void wLewo() {
        x-=predkosc;
    }

    @Override
    public void wPrawo() {
        x+=predkosc;
    }
}
