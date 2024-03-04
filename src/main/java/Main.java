import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Main
{

    static Boolean Running;
    static int ScreenWidth = 800;
    static int ScreenHeight = 450;


    static int ImdbVotes;
    static ArrayList<String> actorsList;
    static String rating;
    static Movie movie = new Movie(actorsList, rating, ImdbVotes);

    static String netWorth;
    static Boolean isAlive = true;
    static Actors actor = new Actors(netWorth, isAlive);

    static GraphicsHandles GH = new GraphicsHandles(ScreenWidth, ScreenHeight, movie, actor);

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
        /*PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        GH.MouseX = (int) b.getX();
        GH.MouseY = (int) b.getY();*/
    }

    public static void LogicUpdate()
    {
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 40) && GH.MouseY < ScreenHeight)
        {
            System.out.println("Screen Clear Has Been Pressed");
            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 40) && GH.MouseY < ScreenHeight)
        {
            System.out.println("Actor Clear Has Been Pressed");
            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 80) && GH.MouseY < (ScreenHeight - 40))
        {
            System.out.println("Search Movie Has Been Pressed");
            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 80) && GH.MouseY < (ScreenHeight - 40))
        {
            System.out.println("Search Actor Has Been Pressed");
            actor.getActorData("robin williams");
            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 120) && GH.MouseY < (ScreenHeight - 80) )
        {
            System.out.println("Enter Movie Has Been Pressed");
            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 120) && GH.MouseY < (ScreenHeight - 80))
        {
            System.out.println("Enter Actor Has Been Pressed");
            GH.Repaint(GH.frame.getGraphics());
        }
    }

    public static void ScreenUpdate()
    {
        GH.Paint(GH.frame.getGraphics());
    }
}