package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 9-10-2016.
 */

public class h10_opdracht4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label;
    String s, tekst;
    int maand;
    int jaar;

    public void init() {
        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type het maandnummer (links) en het jaartal (rechts) en druk op enter");
        tekstvak1.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            maand = Integer.parseInt( s);
            s = tekstvak2.getText();
            jaar = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                            jaar % 400 == 0 ) {
                        tekst = "Februari, 29 dagen";
                    }
                    else {
                        tekst = "Februari, 28 dagen";
                    }
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}