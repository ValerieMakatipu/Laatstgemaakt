package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 6-10-2016.
 */

public class h10_PO extends Applet {

    TextField tekstveld;
    Button knop;


    int invoer;

    String tekst;

    @Override
    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add (tekstveld);

        knop = new Button("Ok");
        add (knop);
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
    }


    @Override
    public void paint (Graphics g){
        super.paint(g);
        int x = 50;
        int y = 80;

        y = y + 20;
        g.drawString("Het cijfer is " + tekst, x, y);
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Integer.parseInt(s);

            switch(invoer) {
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "verkeerd cijfer";
                    break;
            }

            repaint();
        }

    }
}
