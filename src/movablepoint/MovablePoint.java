package movablepoint;

public class MovablePoint extends Point{
    private float xSpeed=2;
    private float ySpeed=2;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float[] speedArray){
        this.xSpeed=speedArray[0];
        this.ySpeed=speedArray[1];
    }
    public float[] getSpeed(){
        return new float[] {this.xSpeed,this.ySpeed};
    }

    public MovablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "( " +x+
                ", " + y +
                ", speed= (" + xSpeed +
                "," + ySpeed +
                "))";
    }
}
