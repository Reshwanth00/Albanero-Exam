public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle();
        Circle cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder();
        // finding the area of the circle of radius 5units
        circle.area(5);
        // finding the lateral surface area of the cylinder of 5units radius and 10 units height
        cylinder1.area(5,10);
        // this also exhibits the overloading concept
        // finding the volume of the cylinder of 5 units radius and 10 units of height
        cylinder1.volume(5,10);
        // polymorphism
        /*
        there are two types of polymorphism
        1--> runtime polymorphism -- the overrides is the best example way to achieve
        2--> compile time polymorphism -- the overloading is the best way to achieve
         */
        // overloading concept
        cylinder.poly();
        circle.poly();
    }

}