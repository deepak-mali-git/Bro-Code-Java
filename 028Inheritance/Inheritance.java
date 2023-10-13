public class Inheritance {
    public static void main(String[] args) {

        // inheritance = the process where one class acquires, the attributes and  methods of another

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        car.doors();
        bicycle.padals();
        System.out.println(car.speed);

        
    }
}