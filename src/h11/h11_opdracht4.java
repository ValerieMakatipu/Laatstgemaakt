package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by CatsLove on 6-11-2016.
 */

public class h11_opdracht4 extends Applet {

    public void paint(Graphics g) {
        
        int x = 0;
        int y = 0;

        while (x < 11) {
            int uitkomst = x * 3;
            g.drawString("3 x " + x + " = " + uitkomst, 20, y);
            x = x + 1;
            y = y + 20;
        }
    }
}