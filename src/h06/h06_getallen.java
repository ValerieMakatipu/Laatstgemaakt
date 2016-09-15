package h06;

/**
 * Created by CatsLove on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class h06_getallen extends Applet {
    double a, b, uitkomst1, uitkomst2, uitkomst3, uitkomst4;

    public void init() {
        a = 113;
        b = 4;
        uitkomst1 = a / b;
        uitkomst2 = a / b;
        uitkomst3 = a / b;
        uitkomst4 = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("ik krijg : " + uitkomst1, 20, 20);
        g.drawString("Jan krijgt : " + uitkomst2, 20, 35);
        g.drawString("Ali krijgt : " + uitkomst3, 20, 50);
        g.drawString("Jeannetten krijgt : " + uitkomst4, 20, 65);
    }
}