import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;


public class Main
{

    static Boolean Running;
    static int ScreenWidth = 800;
    static int ScreenHeight = 450;

    static GraphicsHandles GH =new GraphicsHandles(ScreenWidth, ScreenHeight);

    public static void main(String[] args)
    {
        AppStart();
        AppLoop();
    }

    public static void AppStart()
    {
        GH.Setup();
    }

    public static void AppLoop()
    {
        while (true)
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
        GH.panel.Paint(GH.panel.getGraphics());
    }
}