package chatbot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RightArrowBubble extends JPanel {

    private static final long serialVersionUID = -5389178141802153305L;
    private final int radius = 10;
    private final int arrowSize = 12;
    private final int strokeThickness = 3;
    private final int padding = strokeThickness / 2;

    @Override
    protected void paintComponent(final Graphics g) {
	super.paintComponent(g);
        final Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(new Color(0.2f, 0.3f, 1f));
	int x = padding + strokeThickness + arrowSize;
	int width = getWidth() - arrowSize - (strokeThickness * 2) - 150;
	int bottomLineY = getHeight() - strokeThickness;
	g2d.fillRect(x, padding, width, bottomLineY);
	g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,   RenderingHints.VALUE_ANTIALIAS_ON));
	g2d.setStroke(new BasicStroke(strokeThickness));
	RoundRectangle2D.Double rect = new RoundRectangle2D.Double(x, padding, width, bottomLineY, radius, radius);
	Polygon arrow = new Polygon();
	arrow.addPoint(20, 8);
	arrow.addPoint(0, 10);
	arrow.addPoint(20, 12);
	Area area = new Area(rect);
	area.add(new Area(arrow));
	g2d.draw(area);
    }
    
}