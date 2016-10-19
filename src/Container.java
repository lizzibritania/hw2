/**
 * Created by Lizzi on 19.10.2016.
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;

    private int y2;

    Container(int x, int y,int width,int height)
    {
        x1=x;
        y1=y;
        x2=x+width;
        y2=y-height;
    }

    public int getX() {
        return x1;
    }

    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                ", " + y1 +
                "),(" + x2 +
                "," + y2 +
                ")}";
    }

    public int getY() {
        return x2;
    }

    public int getWidth() {
        return x2-x1;
    }

    public int getHeight() {
        return y2-y1;
    }

    boolean collides(Ball ball)
    {if (((ball.getX()+ball.getRadius())>=x1)&&((ball.getX()+ball.getRadius())<=x2)
            &&((ball.getY()+ball.getRadius())<=y1)&&((ball.getY()+ball.getRadius())>=y2))
    {return true;}
        else
            return false;
}}
