package movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setSpeed(new float[] {5,3});
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
