package h06;

/**
 * Created by CatsLove on 15-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class h06_getallen2 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init(){
        a = Integer.MAX_VALUE;
        b = 20000;
        c = 2;
        uitkomst = a + b + c;
    }

    public void paint (Graphics g) {
        g.drawString("de uitkomst is : " + uitkomst, 20, 20);
    }

}