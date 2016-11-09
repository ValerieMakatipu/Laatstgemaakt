package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 6-11-2016.
 */

public class h11_PO extends Applet {

    int invoer;
    TextField tekstvak;
    Label label;
    Button knop;
    boolean getKlikt;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("Voer een getal in");

        knop = new Button("OK");
        h11_PO.KnopListener kl = new h11_PO.KnopListener();
        knop.addActionListener(kl);

        add(label);
        add(tekstvak);
        add(knop);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0;
        int y = 40;

        if (getKlikt) {
            while (x < 11) {
                int uitkomst = x * invoer;
                g.drawString(invoer + " x " + x + " = " + uitkomst, 20, y);
                x = x + 1;
                y = y + 20;
            }
        }
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);

            getKlikt = true;

            repaint();
        }

    }

}