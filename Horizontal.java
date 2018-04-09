
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.RenderingHints;


public class Horizontal extends Path{

    public Horizontal(int x){
	super(x);
	super.name="Horizontal";
    }

    public void drawHorizontal(Graphics g0ri){
	Graphics2D g = (Graphics2D) g0ri;
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
	g.fill(new Rectangle2D.Double(super.x, super.y, super.HEIGHT, super.WIDTH));
    }
}