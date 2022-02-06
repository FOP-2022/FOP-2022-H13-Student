package h13;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

/**
 * A JPanel to display the following three shapes:
 * <ul>
 * <li>Green ellipse</li>
 * <li>Yellow triangle</li>
 * <li>Blue string</li>
 * </ul>
 *
 * @author Ruben Deisenroth
 */
public class MyPanel extends javax.swing.JPanel {

    // **************** //
    // -- Attributes -- //
    // **************** //

    /**
     * The possible Figures to display
     */
    private enum Figure {
        /**
         * A green ellipse
         */
        GREEN_ELLIPSE,
        /**
         * A yellow rectangle
         */
        YELLOW_RECTANGLE,
        /**
         * A blue string
         */
        BLUE_STRING,
    }

    /**
     * The figures to display ()
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private List<Figure> figuresToDisplay = new ArrayList<>(List.of(
            Figure.BLUE_STRING,
            Figure.YELLOW_RECTANGLE,
            Figure.GREEN_ELLIPSE));

    // TODO: H1.1 - Default Values
    /**
     * The current Transparency of the inner color of the shapes
     * <br>
     * </br>
     * - 0f => completely transparent, 1f => opaque
     */
    private float alpha;

    /**
     * The Saturation of the border color of the shapes
     */
    private float saturation;

    /**
     * The Zoom of the Shapes
     */
    private double zoom;

    /**
     * The Text of the blue string
     */
    private String text;

    /**
     * The Font for the blue string
     */
    private Font font;

    /**
     * The Border width of the green ellipse and the yellow rectangle
     */
    private int borderWidth;

    // ****************** //
    // -- Constructors -- //
    // ****************** //

    /**
     * Creates a new {@link MyPanel}
     */
    public MyPanel() {
        super();
        setOpaque(true);
        setBackground(Color.BLACK);
    }

    // -- Getters and Setters -- //

    /**
     * Getter-Method for the {@link #alpha}-Field
     *
     * @return the value of the {@link #alpha}-Field
     */
    public double getTransparency() {
        return this.alpha;
    }

    /**
     * Setter-Method for the {@link #alpha}-Field.
     * <br>
     * </br>
     * Only values in [0d,1d] are permitted.
     *
     * @param transparency the new Value of the {@link #alpha}-Field
     */
    public void setTransparency(float transparency) {
        // TODO: H1.1
        this.alpha = transparency;
    }

    /**
     * Getter-Method for the {@link #saturation}-Field
     *
     * @return the value of the {@link #saturation}-Field
     */
    public double getSaturation() {
        return this.saturation;
    }

    /**
     * Setter-Method for the {@link #saturation}-Field.
     * <br>
     * </br>
     * Only values in [0d,1d] are permitted.
     *
     * @param saturation the new Value of the {@link #saturation}-Field
     */
    public void setSaturation(float saturation) {
        // TODO: H1.1
        this.saturation = saturation;
    }

    /**
     * Getter-Method for the {@link #zoom}-Field
     *
     * @return the value of the {@link #zoom}-Field
     */
    public double getZoom() {
        return this.zoom;
    }

    /**
     * Setter-Method for the {@link #zoom}-Field.
     * <br>
     * </br>
     * Only positive values are permitted.
     *
     * @param zoom the new Value of the {@link #zoom}-Field
     */
    public void setZoom(double zoom) {
        // TODO: H1.1
        this.zoom = zoom;
    }

    /**
     * Getter-Method for the {@link #text}-Field
     *
     * @return the value of the {@link #text}-Field
     */
    public String getText() {
        return this.text;
    }

    /**
     * Setter-Method for the {@link #zoom}-Field.
     * <br>
     * </br>
     * Only Strings with at least one and at most 30 characters are permitted.
     *
     * @param zoom the new Value of the {@link #zoom}-Field
     */
    public void setText(String text) throws IllegalArgumentException {
        // TODO: H1.1
        this.text = text;
    }

    /**
     * Getter-Method for the {@link #font}-Field
     *
     * @return the value of the {@link #font}-Field
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Setter-Method for the {@link #font}-Field.
     * <br>
     * </br>
     * Only non-null Fonts are permitted.
     *
     * @param font the new Value of the {@link #font}-Field
     */
    public void setFont(Font font) throws IllegalArgumentException {
        // TODO: H1.1
        this.font = font;
    }

    /**
     * Getter-Method for the {@link #borderWidth}-Field
     *
     * @return the value of the {@link #borderWidth}-Field
     */
    public int getBorderWidth() {
        return borderWidth;
    }

    /**
     * Setter-Method for the {@link #borderWidth}-Field.
     * <br>
     * </br>
     * Only values in [1,100] are permitted.
     *
     * @param font the new Value of the {@link #borderWidth}-Field
     */
    public void setBorderWidth(int borderWidth) {
        // TODO: H1.1
        this.borderWidth = borderWidth;
    }

    // ******************* //
    // -- Other Methods -- //
    // ******************* //

    /**
     * Displays the green ellipse if it is not already displayed.
     * If it is already displayed, it will be moved to the end.
     */
    public void addGreenEllipse() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Removes the green ellipse from the Panel.
     * If it is already hidden, the method will do nothing.
     */
    public void removeGreenEllipse() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Displays the yellow rectangle if it is not already displayed.
     * If it is already displayed, it will be moved to the end.
     */
    public void addYellowRectangle() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Removes the yellow rectangle from the Panel.
     * If it is already hidden, the method will do nothing.
     */
    public void removeYellowRectangle() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Displays the blue string if it is not already displayed.
     * If it is already displayed, it will be moved to the end.
     */
    public void addBlueString() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Removes the blue string from the Panel.
     * If it is already hidden, the method will do nothing.
     */
    public void removeBlueString() {
        // TODO: H1.1
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    // Drawing Methods and helpers

    /**
     * Returns a Color generated from the original Color with the desired
     * transparency (alpha).
     *
     * @param c     The Source color
     * @param alpha the desired Alpha
     * @return the generated Color
     */
    private Color colorWithAlpha(Color c, int alpha) {
        // TODO: H1.2
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Returns a Color generated from the original Color with the desired
     * transparency (alpha).
     *
     * @param c     The Source color
     * @param alpha the desired Alpha
     * @return the generated Color
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private Color colorWithAlpha(Color c, float alpha) {
        return colorWithAlpha(c, (int) (alpha * 255 + 0.5));
    }

    /**
     * Returns a Color generated from the original Color with the desired saturation
     *
     * @param c          The Source color
     * @param saturation the desired Saturation
     * @return the generated Color
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private Color colorWithSaturation(Color c, float saturation) {
        // TODO: H1.2
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Centers a rectangular Shape
     *
     * @param <T>         The Dynamic Type of the RectangularShape
     * @param s           the RectangularShape
     * @param scaleX      how much horizontal screen space the shape will take
     *                    (1.0d -> full screen)
     * @param scaleY      how much vertical screen space the shape will take
     *                    (1.0d -> full screen)
     * @param borderWidth the Border width to consider
     * @return the centered Shape (for convenience)
     */
    private <T extends RectangularShape> T centerShape(T s, double scaleX, double scaleY, int borderWidth) {
        // TODO: H1.2
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Fills a Given Shape and also draws a border with the given Colors saving and
     * restoring the original stoke and color of g2d.
     *
     * @param g2d           the specified Graphics context
     * @param interiorColor the Color of the filled Area
     * @param borderColor   the border Color
     * @param borderWidth   the Width of the Border
     * @param s             the Shape to draw
     */
    private void fillDraw(Graphics2D g2d, Color interiorColor, Color borderColor, int borderWidth, Shape s) {
        // TODO: H1.2
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Fills a Given Shape and also draws a border with the given Colors and Scale
     * to the
     * Center of the Screen.
     *
     * @param g2d           the specified Graphics context
     * @param interiorColor the Color of the filled Area
     * @param borderColor   the border Color
     * @param borderWidth   the Width of the Border
     * @param s             the Shape to draw
     * @param scaleX        how much horizontal screen space the shape will take
     *                      (1.0d -> full screen)
     * @param scaleY        how much vertical screen space the shape will take
     *                      (1.0d -> full screen)
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private void fillDrawCentered(Graphics2D g2d, Color interiorColor, Color borderColor, int borderWidth,
            RectangularShape s, double scaleX, double ScaleY) {
        centerShape(s, scaleX, ScaleY, borderWidth);
        fillDraw(g2d, interiorColor, borderColor, borderWidth, s);
    }

    /**
     * Create A shape with the desired Text and the desired width
     *
     * @param g2d         the specified Graphics context to draw the font with
     * @param width       the desired text width
     * @param borderWidth the border width to account for
     * @param text        the string to display
     * @param f           the font used for drawing the string
     * @return The Shape of the outline
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private Shape scaleTextToWidth(Graphics2D g2d, double width, float borderWidth, String text, Font f) {
        // TODO: H1.3
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Draws a given String with the given Color to the center of the Panel.
     *
     * @param g2d           the specified Graphics context
     * @param interiorColor the Color of the filled Area
     * @param borderColor   the border Color
     * @param borderWidth   the Width of the Border
     * @param text          the text to display
     * @param f             the font to use
     * @param width         the desired text width
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private void drawColoredString(Graphics2D g2d, Color interiorColor, Color borderColor, float borderWidth,
            String text, Font f, double width) {
        // TODO: H1.3
        throw new UnsupportedOperationException("Method not Implemented.");
    }

    /**
     * Draws a Grid to help With Positioning
     *
     * @param g2d the specified graphics context
     */
    @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
    private void drawGrid(Graphics2D g2d) {
        // save g2d configuration
        var oldColor = g2d.getColor();
        var oldStroke = g2d.getStroke();

        // Get current size
        Rectangle bounds = getBounds();
        double width = bounds.getWidth();
        double height = bounds.getHeight();

        // G2d Configuration
        g2d.setColor(Color.GRAY);

        float outerTicksWidth = Math.min(width, height) < 500 ? 4 : 6;
        float tenTicksWidth = Math.min(width, height) < 500 ? 2 : 3;
        float fiveTicksWidth = Math.min(width, height) < 500 ? 1 : 2;
        float oneTicksWidth = Math.min(width, height) < 500 ? 0 : 1;

        // Vertical Lines
        for (double i = 0, x = 0; x < width; i++, x += width / 100d) {
            float strokeWidth = i % 10 == 0 ? tenTicksWidth : i % 5 == 0 ? fiveTicksWidth : oneTicksWidth;
            if (strokeWidth <= 0) {
                continue;
            }
            g2d.setStroke(new BasicStroke(strokeWidth));
            g2d.drawLine((int) x, 0, (int) x, (int) height);
        }

        // Horizontal Lines
        for (double i = 0, y = 0; y < height; i++, y += height / 100d) {
            float strokeWidth = i % 10 == 0 ? tenTicksWidth : i % 5 == 0 ? fiveTicksWidth : oneTicksWidth;
            if (strokeWidth <= 0) {
                continue;
            }
            g2d.setStroke(new BasicStroke(strokeWidth));
            g2d.drawLine(0, (int) y, (int) width, (int) y);
        }

        // Border
        g2d.setStroke(new BasicStroke(outerTicksWidth));
        g2d.drawRect(
                (int) (.5 * outerTicksWidth),
                (int) (.5 * outerTicksWidth),
                (int) (width - outerTicksWidth),
                (int) (height - outerTicksWidth));

        // Restore g2d Configuration
        g2d.setColor(oldColor);
        g2d.setStroke(oldStroke);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Convert to g2d
        @SuppressWarnings("unused") // Kann entfernt werden, sobald die Methode verwendet wird
        Graphics2D g2d = (Graphics2D) g;

        // Optional: draw a grid that helps with positioning
        // TODO: Remember to disable for submission
        // drawGrid(g2d);

        // Paint the desired Figures to the Center of the Screen
        // TODO: H1.3
    }
}
