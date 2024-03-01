import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class PanelHandler extends JPanel
{
    PanelHandler(int ScreenWeidth, int ScreenHeight)
    {
        this.setPreferredSize(new Dimension(ScreenWeidth, ScreenHeight));
    }

    public void Paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.draw(new Rectangle2D.Double(400, 225, 50, 50));
        repaint();
    }
}
