import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicsHandles extends JFrame implements MouseListener
{
    JFrame frame = new JFrame("CS.TA98");

    int SW;
    int SH;
    public GraphicsHandles(int ScreenWidth, int ScreenHeight)
    {
        SW = ScreenWidth;
        SH = ScreenHeight;
    }

    public void Setup()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SW, SH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addMouseListener(this);
    }

    public void Paint(Graphics g)
    {
        int RecW = SW/2;
        int RecH = 40;
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));

        g2D.setColor(Color.black);
        g2D.drawLine((SW/2), 0, (SW/2), SH);

        g2D.drawRect(0, (SH - RecH), RecW, RecH);
        g2D.drawString("Clear", 20, (SH - 15));

        g2D.drawRect((SW/2), (SH - RecH), RecW, RecH);
        g2D.drawString("Clear", (SW/2 + 20), (SH - 15));

        g2D.drawRect(0, (SH - 2*RecH), RecW, RecH);
        g2D.drawString("Search Movie", 20, (SH - 15 - RecH));

        g2D.drawRect((SW/2), (SH - 2*RecH), RecW, RecH);
        g2D.drawString("Search Actor", (SW/2 + 20), (SH - 15 - RecH));
    }

    public void Repaint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Released");
    }
}