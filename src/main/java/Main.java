import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Main
{

    static Boolean Running;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Canvas();
        canvas.setSize(800, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        AppStart();
        AppLoop();
    }
    public static void AppStart()
    {

    }
    public static void AppLoop()
    {
        while (true)
        {
            Input();
            LogicUpdate();
            GraphicsUpdate();
        }
    }
    public static void Input()
    {

    }
    public static void LogicUpdate()
    {

    }

    public static void GraphicsUpdate()
    {

    }
}