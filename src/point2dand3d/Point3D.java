package point2dand3d;

public class Point3D extends Point2D{
    private float z=0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float[] arrayXYZ){
        super.x=arrayXYZ[0];
        super.y=arrayXYZ[1];
        this.z=arrayXYZ[2];
    }
    public float[] getXYZ(){

        return new float[]{super.x, super.y,this.z};
    }
    public String toString(){
        return "( "
                +super.x
                +", "
                +super.y
                +", "
                +this.z
                +" )";
    }
}
