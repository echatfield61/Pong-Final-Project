public class PongBall 
{
    int x;
    int y;
    int velX;
    int velY;
    
    public PongBall(int initX, int initY, int initXVel, int initYVel)
    {
        this.x=initX;
        this.y=initY;
        this.velX=initXVel;
        this.velY=initYVel;
    }

    public int getY()
    {
        return y;
    }
    public int getX()
    {
        return x;
    } 
    public void bounceX()
    {
        velX=(-1)*velX;
    }
    public void bounceY()
    {
        velY=(-1)*velY;
    }
    public void move()
    {
        x= x+velX;
        y= y+velY;
    }
}
