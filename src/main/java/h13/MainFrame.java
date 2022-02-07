package h13;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The Main Drawing Frame for H13 containing a {@link MyPanel}
 *
 * @author Ruben Deisenroth
 */
public class MainFrame extends JFrame {
    /**
     * The {@link MyPanel}-Object that draws the shapes
     */
    private final MyPanel panel;

    /**
     * Creates a new {@link MainFrame}
     */
    public MainFrame(MyPanel panel) {
        super("H13");
        this.panel = panel;
    }

    /**
     * Getter-Method for the {@link #zoom}-Field
     *
     * @return the value of the {@link #zoom}-Field
     */
    public MyPanel getPanel() {
        return panel;
    }

    /**
     * Initialize and Display the Frame
     */
    public void init() {
        // Frame Properties
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 300));
        setLayout(new BorderLayout());

        // Add Components
        // TODO: H2.1

        // Add Listeners
        // TODO: H2.1

        // Set Dimension and Position
        // TODO: H2.1

        // Show Frame
        // TODO: H2.1

    }
}
