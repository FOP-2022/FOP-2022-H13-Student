package h13;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.EventQueue;

/**
 * @author Ruben Deisenroth
 */
public class TwoSimpleWindows {

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame zeichenfenster = new MainFrame(new MyPanel());
                ControlFrame steuerungsfenster = new ControlFrame(zeichenfenster);
                zeichenfenster.init();
                steuerungsfenster.init();
            }
        });
    }
}
