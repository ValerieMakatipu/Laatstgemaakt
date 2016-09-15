package h05;

import java.applet.Applet;
import java.awt.*;
/**
 * Created by CatsLove on 15-9-2016.
 */
public class h05_variabelen1 extends Applet {

    Color achtergrond;
    Color tabellen;
    Color tekst;
    int breedte;
    int GewichtValerie;
    int GewichtJeroen;
    int GewichtHans;
    int bassline;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color(255, 255, 255);
        tabellen = new Color(255, 0, 0);
        tekst = new Color(0, 0, 0);
        breedte = 20;
        bassline = 260;
        GewichtValerie = 40;
        GewichtJeroen = 100;
        GewichtHans = 80;
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {
        g.setColor(tekst);
        g.drawLine(30, 20, 30, bassline);
        g.drawLine(30, bassline, 230, bassline);
        g.drawLine(25, 220, 35, 220);
        g.drawLine(25, 180, 35, 180);
        g.drawLine(25, 140, 35, 140);
        g.drawLine(25, 100, 35, 100);
        g.drawLine(25, 60, 35, 60);
        g.drawLine(25, 20, 35, 20);
        g.drawString("20", 3, 225);
        g.drawString("40", 3, 185);
        g.drawString("60", 3, 145);
        g.drawString("80", 3, 105);
        g.drawString("100", 3, 65);
        g.drawString("120", 3, 25);
        g.drawLine(80, 265, 80, 255);
        g.drawLine(130, 265, 130, 255);
        g.drawLine(180, 265, 180, 255);
        g.drawString("Valerie", 60, 280);
        g.drawString("Jeroen", 110, 280);
        g.drawString("Hans", 165, 280);
        g.setColor(tabellen);
        g.fillRect(70, bassline - 2 * GewichtValerie, breedte, 2 * GewichtValerie);
        g.fillRect(120, bassline - 2 * GewichtJeroen, breedte, 2 * GewichtJeroen);
        g.fillRect(170, bassline - 2 * GewichtHans, breedte, 2 * GewichtHans);
    }
}