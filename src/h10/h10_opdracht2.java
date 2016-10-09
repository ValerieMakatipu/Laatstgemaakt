package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 6-10-2016.
 */
public class h10_opdracht2 extends Applet {

    TextField tekstveld;
    Button knop;


    double invoer;
    double grootste;
    double kleinste;

    @Override
    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add (tekstveld);
        grootste = 0;
        kleinste = 32424;

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

        g.drawString("Grootste: " + grootste, x, y);
        y = y + 20;
        g.drawString("Kleinste: " + kleinste, x, y);
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            if (invoer > grootste) {
                grootste = invoer;
            }
            if (invoer < kleinste) {
                kleinste = invoer;
            }

            repaint();
        }

    }
}
