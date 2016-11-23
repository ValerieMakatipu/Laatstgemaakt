package h12;

import javax.jws.soap.SOAPBinding;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CatsLove on 11-11-2016.
 */
public class h12_opdracht2 extends Applet {

    Button Useless;

    public void init() {
        for (int j = 0; j < 25 ; j++) {
            Useless = new Button("Useless");

            Useless.addActionListener(new h12_opdracht2.KnopListener());
            add(Useless);
        }
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}

