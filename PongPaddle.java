

public class PongPaddle 
{
    public int x;
    public int y;
    public int width;
    public int height;
    
    public PongPaddle(int top,int left,int w,int h)
    {
        y=top;
        x=left;
        width=w;
        height = h;
        

    }
    public int getBottomY()
    {
        return y+height-1;
    }
    public int getTopY()
    {
        return y;
    }
    public int getRightX()
    {
        return x+width-1;
    }
    public int getLeftX()
    {
        return x;
    }
    public void moveDown(int pixels)
    {
        y+=pixels;

    }
    public void moveUp(int pixels)
    {
        y-=pixels;
    }
    
}
