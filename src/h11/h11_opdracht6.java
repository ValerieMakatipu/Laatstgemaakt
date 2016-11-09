package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by CatsLove on 6-11-2016.
 */
public class h11_opdracht6 extends Applet {


    @Override
    public void paint (Graphics g){
        super.paint(g);

        int x = 100;
        int y = 10;

        while (x > 50) {
            g.drawOval(x, x, y, y);
            x = x - 10;
            y = y + 20;

        }
    }
}
