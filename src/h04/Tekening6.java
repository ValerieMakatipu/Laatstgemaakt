package h04;

/**
 * Created by CatsLove on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekening6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillArc(20, 20, 50, 50, 0, 180);
        g.fillRect(20, 45, 50, 70);
        g.fillArc(20, 90, 50, 50, 0, -180);
        g.setColor(Color.orange);
        g.fillArc(35, 70, 20, 20, 0, 360);
        g.setColor(Color.red);
        g.fillArc(35, 40, 20, 20, 0, 360);
        g.setColor(Color.green);
        g.fillArc(35, 100, 20, 20, 0, 360);
    }
}