package collections.task03;

import java.io.IOException;
import java.util.Iterator;

import static collections.task03.LottoGame.*;

public class Main {
    public static void main(String[] args) throws IOException {

        LottoGame.play();
        System.out.println("Lotto numbers ... :");
        LottoGame.showTheSet(doTheLots());
        System.out.println("User numbers ... :");
        LottoGame.showTheSet(lotto);
        System.out.println("Your result ... : "+ LottoGame.showTheResult(lotto,randomSet));


    }
}
