package h04;

/**
 * Created by CatsLove on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekening2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine (50, 20, 20, 50);
        g.drawLine (50, 20, 80, 50);
        g.drawLine (20, 50, 20, 100);
        g.drawLine (20, 100, 80, 100);
        g.drawLine (80, 50, 80, 100);
        g.drawLine (60, 100, 60, 80);
        g.drawLine (60, 80, 50, 80);
        g.drawLine (50, 80, 50, 100);
        g.drawLine (30, 95, 40, 95);
        g.drawLine (30, 95, 30, 87);
        g.drawLine (30, 87, 40, 87);
        g.drawLine (40, 87, 40, 95);

    }
}