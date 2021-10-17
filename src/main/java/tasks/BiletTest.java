package tasks;

import java.util.Scanner;

public class BiletTest {
    public static void main(String[] args) {
        Bilet bilet1 = Bilet.ULGOWY_GODZINNY;
        Bilet bilet2 = Bilet.ULGOWY_CALODNOWY;
        Bilet bilet3 = Bilet.NORMALNY_GODZINNY;
        Bilet bilet4 = Bilet.NORMALNY_CALODNIOWY;
        Bilet bilet5 = Bilet.BRAK_BILETU;

//        bilet1.wyswietlDaneOObiekcie(Bilet.ULGOWY_GODZINNY);
//        bilet5.wyswietlDaneOObiekcie(Bilet.BRAK_BILETU);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek ...");
        int wiek = scanner.nextInt();
        System.out.println("Podaj czas jazdy w minutach...");
        int czasJazdy = scanner.nextInt();
        System.out.println("Podaj ilość posiadanej kasy ...");
        double dostepnaKwota = scanner.nextDouble();
        System.out.println(odpowiedniBilet(wiek, czasJazdy, dostepnaKwota));


    }

    public static Bilet odpowiedniBilet(int wiek, int czasJazdy, double dostepnaKwota) {
        Bilet odpowiedniBilet = null;
        if (wiek > 18) {
            if (czasJazdy > 60) {
                odpowiedniBilet = Bilet.NORMALNY_CALODNIOWY;
            } else {
                odpowiedniBilet = Bilet.NORMALNY_GODZINNY;
            }
        } else {
            if (czasJazdy > 60) {
                odpowiedniBilet = Bilet.ULGOWY_CALODNOWY;
            } else {
                odpowiedniBilet = Bilet.ULGOWY_GODZINNY;
            }
        }
        if (odpowiedniBilet.getCeneBiletu() > dostepnaKwota) {
            odpowiedniBilet = Bilet.BRAK_BILETU;
        }

        return odpowiedniBilet;
    }
}
