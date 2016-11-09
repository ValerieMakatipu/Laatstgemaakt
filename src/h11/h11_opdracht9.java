package h11;

import java.awt.*;
import java.applet.*;

public class h11_opdracht9 extends Applet{

    public void paint(Graphics g) {
        setBackground(Color.orange);
        int x;
        int y = 50;
        for (int row = 0; row < 4; row++) {
            x = 50;
            y += 40;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 40, 40);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 40, 40);
                } x += 40;
            }
            x = 50;
            y += 40;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 40, 40);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 40, 40);
                } x += 40;
            }
        }
    }
}