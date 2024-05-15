public class PongBall 
{
    double x;
    double y;
    double velX;
    double velY;
    
    public PongBall(int initX, int initY, int initXVel, int initYVel)
    {
        this.x=initX;
        this.y=initY;
        this.velX=initXVel;
        this.velY=initYVel;
    }

    public double getY()
    {
        return y;
    }
    public double getX()
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
