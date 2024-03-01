import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Graphics2D;

public class GraphicsHandles extends JFrame
{
    PanelHandler panel;
    int SW;
    int SH;
    GraphicsHandles(int ScreenWidth, int ScreenHeight)
    {
        SW = ScreenWidth;
        SH = ScreenHeight;
    }

    public void Setup()
    {
        panel = new PanelHandler(SW, SH);
        panel.setPreferredSize(new Dimension(SW, SH));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panel);
        this.pack();
    }
}
