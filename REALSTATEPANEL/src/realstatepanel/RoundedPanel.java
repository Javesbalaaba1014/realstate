package realstatepanel;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private int radius;

    public RoundedPanel(int radius) {
        this.radius = radius;
        setOpaque(false); // Make sure background is transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics2D = (Graphics2D) g.create();

        // Make sure to enable anti-aliasing to smooth the edges
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the rounded panel with the specified radius
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0, 0, width, height, radius, radius);

        graphics2D.setColor(getForeground());
        graphics2D.drawRoundRect(0, 0, width - 1, height - 1, radius, radius);

        graphics2D.dispose();
    }
}