package triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle.setColor("blue");
        Scanner scanner =new Scanner(System.in);
        float sideNo1=0;
        float sideNo2=0;
        float sideNo3=0;


        do {
            System.out.println("Enter three sides: ");
            sideNo1 = scanner.nextFloat();
            sideNo2 = scanner.nextFloat();
            sideNo3 = scanner.nextFloat();
        }while(sideNo1<=0||sideNo2<=0||sideNo3<=0||sideNo1+sideNo2<sideNo3||sideNo2+sideNo3<sideNo1||sideNo1+sideNo3<sideNo2);
        triangle.set3Side(new float[] {sideNo1,sideNo2,sideNo3});
        System.out.println(triangle);
        System.out.println("area="+triangle.getArea());

    }
}
