public class Myprogram {
    public static void main(String[] args) {

        Car car = new Car("Bmw");
        System.out.println(car.name);
        Garage garage = new Garage();

        garage.park(car);
        
    }
}