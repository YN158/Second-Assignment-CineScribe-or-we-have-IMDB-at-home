import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicsHandles extends JFrame implements MouseListener
{
    JFrame frame = new JFrame("W.H.M.A.H");

    int SW;
    int SH;

    int MouseX = 0;
    int MouseY = 0;
    boolean clicked = false;

    Movie movie;
    Actors actor;

    public GraphicsHandles(int ScreenWidth, int ScreenHeight, Movie M, Actors A)
    {
        SW = ScreenWidth;
        SH = ScreenHeight;
        movie = M;
        actor = A;
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

        g2D.drawRect(0, (SH - 3*RecH), RecW, RecH);
        g2D.drawString("Enter Movie Name:", 20, (SH - 15 - 2*RecH));

        g2D.drawRect((SW/2), (SH - 2*RecH), RecW, RecH);
        g2D.drawString("Search Actor", (SW/2 + 20), (SH - 15 - RecH));

        g2D.drawRect((SW/2), (SH - 3*RecH), RecW, RecH);
        g2D.drawString("Enter Actor Name:", (SW/2 + 20), (SH - 15 - 2*RecH));

        g2D.drawString("Movie Name:", (20), (50));
        g2D.drawString("The IMBD Score:", (20), (70));
        g2D.drawString(movie.rating, (110), (70));
        g2D.drawString("IMDB Votes:", (20), (90));
        g2D.drawString("List Of Actors:", (20), (110));

        g2D.drawString("Actor's Name:", (SW/2 + 20), (50));
        g2D.drawString(actor.Name, (SW/2 + 110), (50));
        g2D.drawString("NetWorth:", (SW/2 + 20), (70));
        g2D.drawString(actor.netWorth, (SW/2 + 110), (70));
        g2D.drawString("Year of birth:", (SW/2 + 20), (90));
        g2D.drawString("Year of death:", (SW/2 + 20), (110));
    }

    public void Repaint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Clicked");
        MouseY = e.getY();
        MouseX = e.getX();
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        //System.out.println("Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        //System.out.println("Pressed");
        clicked = true;
    }
    public void mouseReleased(MouseEvent e)
    {
        //System.out.println("Released");
        clicked = false;
    }
}