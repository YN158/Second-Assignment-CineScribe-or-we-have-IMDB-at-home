import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class MouseHandler implements MouseListener
{
    boolean run;
    int MouseX;
    int MouseY;
    Container pane;
    public MouseHandler(JFrame frame)
    {
        run = true;
        MouseX = 0;
        MouseY = 0;
        pane = frame.getContentPane();
        pane.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        run = false;
    }
    public void mouseEntered(MouseEvent e)
    {
        run = false;
    }
    public void mouseExited(MouseEvent e)
    {
        run = false;
    }
    public void mousePressed(MouseEvent e)
    {
        run = false;
    }
    public void mouseReleased(MouseEvent e)
    {
        run = false;
    }
}