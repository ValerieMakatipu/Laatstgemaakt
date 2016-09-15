package h05;

import java.awt.*;
import java.applet.*;

/**
 * Created by CatsLove on 15-9-2016.
 */

public class h05_variabelen extends Applet {

    Color achtergrond;
    Color tekst;
    Color vulling;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color (255, 255, 255);
        tekst = new Color (0, 0, 0);
        vulling = new Color (255, 0, 255);
        breedte = 110;
        hoogte = 60;
        setBackground (achtergrond);
    }

    public void paint(Graphics g) {
        g.setColor(tekst);
        g.drawLine(20, 20, 130, 20);
        g.drawString("Lijn", 45, 35);
        g.drawRect(20, 50, breedte, hoogte);
        g.drawString("Rechthoek", 30, 130);
        g.drawRoundRect(20, 145, breedte, hoogte, 20, 20);
        g.drawString("Afgeronde rechthoek", 20, 220);
        g.setColor(vulling);
        g.fillRect(160, 50, breedte, hoogte);
        g.setColor(tekst);
        g.drawOval(160, 50, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 135, 130);
        g.setColor(vulling);
        g.fillOval(160, 145, breedte, hoogte);
        g.setColor(tekst);
        g.drawString("Gevulde ovaal", 170, 220);
        g.drawOval(310, 50, breedte, hoogte);
        g.setColor(vulling);
        g.fillArc(310, 50, breedte, hoogte, 0, 45);
        g.setColor(tekst);
        g.drawString("Taartpunt met ovaal eromheen", 310, 130);
        g.drawArc(310, 145, hoogte, hoogte, 0, 360);
        g.drawString("Cirkel", 325, 220);
    }
}