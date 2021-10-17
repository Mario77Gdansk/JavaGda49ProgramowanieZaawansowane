package interfaces.presentation;

public interface Powiekszalny {
    int pobierzSzerokosc();
    int pobierzWysokosc();
    void powiekszO(int wymiar);
    void poszerzO(int wymiar);

    default void powiekszNRazy(int n){
        int aktualnaWysokosc = pobierzWysokosc();
        for(int i=1;i<n;i++){
            powiekszO(aktualnaWysokosc);
        }
    }
    default void poszerzNRazy(int n){
        int aktualnaSzerokosc = pobierzSzerokosc();
        for(int i=1;i<n;i++){
            poszerzO(aktualnaSzerokosc);
        }
    }
}
