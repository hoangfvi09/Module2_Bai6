package triangle;

public class Triangle extends Shape{
    private float sideNo1=4;
    private float sideNo2=4;
    private float sideNo3=4;

    public Triangle(float sideNo1, float sideNo2, float sideNo3) {
        this.sideNo1 = sideNo1;
        this.sideNo2 = sideNo2;
        this.sideNo3 = sideNo3;
    }
    public Triangle(){

    }

    public float getSideNo1() {
        return sideNo1;
    }

    public void setSideNo1(float sideNo1) {
        this.sideNo1 = sideNo1;
    }

    public float getSideNo2() {
        return sideNo2;
    }

    public void setSideNo2(float sideNo2) {
        this.sideNo2 = sideNo2;
    }

    public float getSideNo3() {
        return sideNo3;
    }

    public void setSideNo3(float sideNo3) {
        this.sideNo3 = sideNo3;
    }

    public float[] get3Side(){
        return new float[] {sideNo1,sideNo2,sideNo3};
    }
    public void set3Side(float[] sidesArray){
        sideNo1=sidesArray[0];
        sideNo2=sidesArray[1];
        sideNo3=sidesArray[2];
    }
    public float getHalfOfPerimeter(){
        return (sideNo1+sideNo2+sideNo3)/2;
    }
    public float getPerimeter(){
        return sideNo1+sideNo2+sideNo3;
    }


    public double getArea(){
        return Math.pow(getHalfOfPerimeter()*(getHalfOfPerimeter()-sideNo1)*(getHalfOfPerimeter()-sideNo2)*(getHalfOfPerimeter()-sideNo3),0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideNo1=" + sideNo1 +
                ", sideNo2=" + sideNo2 +
                ", sideNo3=" + sideNo3 +
                ",color= "+super.getColor()+
                ",area= "+getArea()+
                ",perimeter= "+getPerimeter()+
                '}';
    }

}
