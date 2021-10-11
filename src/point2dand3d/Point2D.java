package point2dand3d;

public class Point2D {
    float x=0;
    float y=0;
    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float[] arrayXY){
        this.x=arrayXY[0];
        this.y=arrayXY[1];
    }
    public float[] getXY(){

        return new float[]{this.x, this.y};
    }
    public String toString(){
        return "( "
                +this.x
                +", "
                +this.y
                +" )";
    }
}
