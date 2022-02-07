package h13;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A Control Frame that contains all the necessary Control Elements for the Main
 * Frame
 *
 * @author Ruben Deisenroth
 */
public class ControlFrame extends JFrame {
    /**
     * The Main Frame to control
     */
    @SuppressWarnings("unused")
    private MainFrame mf;
    /**
     * A button that calls {@link MyPanel#addGreenEllipse()} when clicked
     */
    @SuppressWarnings("unused")
    private JButton addEllipseButton = new JButton("Add ellipse");
    /**
     * A button that calls {@link MyPanel#addYellowRectangle()} when clicked
     */
    @SuppressWarnings("unused")
    private JButton addRectangleButton = new JButton("Add rectangle");
    /**
     * A button that calls {@link MyPanel#addBlueString()} when clicked
     *
     */
    @SuppressWarnings("unused")
    private JButton addStringButton = new JButton("Add string");
    /**
     * A button that calls {@link MyPanel#removeGreenEllipse()} when clicked
     */
    @SuppressWarnings("unused")
    private JButton removeElipseButton = new JButton("Remove ellipse");
    /**
     * A button that calls {@link MyPanel#removeYellowRectangle()} when clicked
     */
    @SuppressWarnings("unused")
    private JButton removeRectangleButton = new JButton("Remove rectangle");
    /**
     * A button that calls {@link MyPanel#removeBlueString()} when clicked
     */
    @SuppressWarnings("unused")
    private JButton removeStringButton = new JButton("Remove string");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that controls the
     * transparency via {@link MyPanel#setTransparency(float)} when clicked
     */
    @SuppressWarnings("unused")
    private JButton changeTransparencyButton = new JButton("Change transparency");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that controls the
     * saturation via {@link MyPanel#setSaturation(float)} when clicked
     */
    @SuppressWarnings("unused")
    private JButton changeSaturationButton = new JButton("Change saturation");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that controls the
     * saturation via {@link MyPanel#setBorderWidth(int)} when clicked
     */
    @SuppressWarnings("unused")
    private JButton changeBorderWidthButton = new JButton("Change border width");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that controls the
     * font via {@link MyPanel#setFont(java.awt.Font)} when clicked
     */
    @SuppressWarnings("unused")
    private JButton changeFontButton = new JButton("Change font");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that controls the
     * saturation via {@link MyPanel#setZoom(double)} when clicked
     */
    @SuppressWarnings("unused")
    private JButton changeZoomButton = new JButton("Change zoom");
    /**
     * A button that opens a {@link PropertyChangeDialogue} that exits the Program when clicked
     */
    @SuppressWarnings("unused")
    private JButton exitButton = new JButton("Exit");
    /**
     * The {@link PropertyChangeDialogue} that pops up when a Property needs to be
     * changed and updates the property in real Time
     */
    @SuppressWarnings("unused")
    private final PropertyChangeDialogue pcd = new PropertyChangeDialogue();

    /**
     * Creates a new {@link ControlFrame}-Instance
     *
     * @param mf
     */
    public ControlFrame(MainFrame mf) {
        super("Steuerungsfenster");
        this.mf = mf;
    }

    /**
     * Initializes and shows the Frame
     */
    public void init() {
        // Frame Properties
        // TODO: H2.2
        // Add Listeners
        // TODO: H2.2
        // Set Dimension and Position
        // TODO: H2.2
        // Show Frame
        // TODO: H2.2
    }
}
