import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main
{

    static Boolean Running;
    static int ScreenWidth = 800;
    static int ScreenHeight = 450;

    static GraphicsHandles GH = new GraphicsHandles(ScreenWidth, ScreenHeight);
    //static MouseHandler MH = new MouseHandler(GH.frame);

    public static void main(String[] args)
    {
        AppStart();
        AppLoop();
    }

    public static void AppStart()
    {
        GH.Setup();
        Running = true;
    }

    public static void AppLoop()
    {
        while (Running)
        {
            Input();
            LogicUpdate();
            ScreenUpdate();
        }
    }

    public static void Input()
    {

    }

    public static void LogicUpdate()
    {

    }

    public static void ScreenUpdate()
    {
        GH.Paint(GH.frame.getGraphics());
    }
}