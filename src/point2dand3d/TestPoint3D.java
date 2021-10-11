package point2dand3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3d=new Point3D();
        System.out.println(point3d);

        point3d.setXYZ(new float[] {4,7,2});
        System.out.println(point3d);
    }
}
