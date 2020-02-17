package svit;

import java.awt.*;

public class Config {
    public static final int SIZE = 10;
    public static final int WIDTH = 160;
    public static final int HEIGHT = 80;
    public static final int SLEEPMS = 100;

    public static Color getColor(Status status)
    {
        switch (status)
        {
            default:
            case NONE: return Color.BLACK;
            case BORN: return Color.GRAY;
            case LIVE: return Color.BLUE;
            case DIED: return Color.YELLOW;
        }
    }
}
