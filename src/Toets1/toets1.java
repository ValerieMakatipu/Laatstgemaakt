package Toets1;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class toets1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    boolean ongeldigInvoer;

    int invoer;
    int amsterdamTijdVerschil, helsinkiTijdVerschil, omskTijdVerschil, jakartaTijdVerschil;

    int amsterdamTijd, helsinkiTijd, omskTijd, jakartaTijd;

    public void init() {

        ongeldigInvoer = false;

        amsterdamTijdVerschil = 0;
        helsinkiTijdVerschil = 1;
        omskTijdVerschil = 4;
        jakartaTijdVerschil = 5;

        tekstvak = new TextField("", 20);
        label = new Label("Voer een uur in");

        knop = new Button("Toon tijden");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        add(label);
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint (Graphics g){
        super.paint(g);
        int x = 20;
        int y = 75;
        if (ongeldigInvoer){
            g.drawString("Ongeldig invoer!", x, y);
        }
        else {
            g.drawString("Tijd in Amsterdam: " + amsterdamTijd + ":00 uur", x, y);
            y = y + 15;
            g.drawString("Tijd in Helsinki: " + helsinkiTijd + ":00 uur", x, y);
            y = y + 15;
            g.drawString("Tijd in Omsk: " + omskTijd + ":00 uur", x, y);
            y = y + 15;
            g.drawString("Tijd in Jakarta: " + jakartaTijd + ":00 uur", x, y);
        }
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            amsterdamTijd = invoer + amsterdamTijdVerschil;
            amsterdamTijd = (amsterdamTijd + 24) % 24;

            helsinkiTijd = invoer + helsinkiTijdVerschil;
            helsinkiTijd = (helsinkiTijd + 24) % 24;

            omskTijd = invoer + omskTijdVerschil;
            omskTijd = (omskTijd + 24) % 24;

            jakartaTijd = invoer + jakartaTijdVerschil;
            jakartaTijd = (jakartaTijd + 24) % 24;

            ongeldigInvoer = (invoer > 23) || (invoer < 0);

            repaint();
        }
    }
}