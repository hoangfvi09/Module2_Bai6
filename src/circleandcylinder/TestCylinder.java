package circleandcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder.setHeight(20);
        cylinder.setColor("orange");
        cylinder.setRadius(15);
        System.out.println(cylinder);
    }
}
