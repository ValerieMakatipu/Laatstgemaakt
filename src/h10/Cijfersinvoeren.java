package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 6-10-2016.
 */
public class Cijfersinvoeren extends Applet {

    TextField tekstveld;
    Button knop;


    double invoer;
    double totaal;

    double gemiddelde;

    int aantalcijfers;

    boolean getKlikt;

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

             if (invoer < 5.5) {
                 g.drawString("Het cijfer is onvoldoende", x, y);
             } else {
                 g.drawString("Het cijfer is voldoende", x, y);
             }

             y = y + 20;
             g.drawString("Gemiddelde" + gemiddelde, x, y);
     }

     class KnopListener implements ActionListener {

         @Override
         public void actionPerformed(ActionEvent e) {
             String s = tekstveld.getText();
             invoer = Double.parseDouble(s);

             totaal = totaal + invoer;
             aantalcijfers++;

             gemiddelde = totaal / aantalcijfers;

             repaint();
         }

     }
}
