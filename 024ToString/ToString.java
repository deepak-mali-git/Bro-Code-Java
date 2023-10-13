public class ToString {
    public static void main(String[] args) {

        // ToString() = special method that all objects inherit that returns a string that "textually represents" an object. can be used both implicitly and explicitly

        Car car = new Car();


        System.out.println(car);
        System.out.println(car.toString());

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);


        
        
    }

    static class Car
    {
        String make = "Ford";
        String model =  "Mustang";
        String color = "red";
        int year = 2021;

        public String toString(){
            return make + "  " + model + "  " + color + "  " + year;
        }
    }
}