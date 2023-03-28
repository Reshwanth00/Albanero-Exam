
public class Cylinder extends Circle{
    public void area(int radius,int height){
        System.out.println((2*3.14*(radius)*(radius))+(height*(2*3.14*(radius))));
    }
    public void volume(int radius,int height){
        System.out.println(3.14*(radius)*(radius)*(height));
    }
    public void poly(){
        System.out.println("this is type 2");
    }
}
