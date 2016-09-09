package h04;

/**
 * Created by CatsLove on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekening1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine (20, 20, 80, 120);
        g.drawLine (140, 20, 80, 120);
        g.drawLine (140, 20, 20, 20);
    }
}