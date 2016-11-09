package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by CatsLove on 6-11-2016.
 */

public class h11_opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 20; teller > 9; teller--) {
            y += 20;
            g.drawString("" + teller, 50, y );
        }
    }
}

