import java.awt.*;

public class PongPaddle 
{
    public int x;
    public int y;
    public int width;
    public int height;
    private Rectangle paddle = new  Rectangle( x,  y,  width,  height);
    public PongPaddle(int top,int left,int w,int h)
    {
        y=top;
        x=left;
        width=w;
        height = h;
        

    }
    public int getBottomY()
    {
        return (int)(paddle.getY()+paddle.getWidth());
    }
    public int getTopY()
    {
        return (int)(paddle.getY());
    }
    public int getRightX()
    {
        return (int)(paddle.getX()+paddle.getHeight());
    }
    public int getLeftX()
    {
        return (int)(paddle.getX());
    }
    public void moveDown(int pixels)
    {
        y-=pixels;
    }
    public void moveUp(int pixels)
    {
        y+=pixels;
    }
    
}
