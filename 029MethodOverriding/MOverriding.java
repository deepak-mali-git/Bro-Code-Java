public class MOverriding {
    public static void main(String[] args) {

        // method overriding = declaring a method in sub class , 
        //                     which is already present in parent class.    
        //                      so that a child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }

    
static class Animal{
    
    void speak(){
        System.out.println("The animal speaks");
    }
}


static class Dog extends Animal {

    @Override
    void speak(){
        System.out.println("The dog goes bark");
    }
}

}
