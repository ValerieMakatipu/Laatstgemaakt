package h06;

/**
 * Created by CatsLove on 15-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class h06_getallenPO extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;

    public void init () {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        double gemiddelde = a + b + c;
        gemiddelde = gemiddelde / 3;
        uitkomst = (double)(int)(gemiddelde * 10) / 10.0;
    }

    public void paint (Graphics g) {
        g.drawString("Het gemiddelde is : " + uitkomst, 20, 20);
    }
}
