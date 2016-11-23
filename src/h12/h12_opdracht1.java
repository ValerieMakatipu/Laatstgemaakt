package h12;

import java.awt.*;
import java.applet.*;

public class h12_opdracht1 extends Applet {

    double cijfers[];
    int totaal = 0;

    public void init() {
        cijfers = new double [10];

        for (int teller = 0; teller < cijfers.length; teller ++) {
            cijfers[teller] = 100 * teller + 100;
        }

        for(int i=0; i < cijfers.length; i++){
            totaal += cijfers[i];
        }
    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < cijfers.length; teller ++) {
            g.drawString("" + cijfers[teller], 50, 20 * teller + 20);
        }
            double gemiddelde = (double) totaal / cijfers.length;
            g.drawString("Gemiddelde = " + gemiddelde, 50, 240);
    }
}