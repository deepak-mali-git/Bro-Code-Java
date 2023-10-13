public class Constructor {
    public static void main(String[] args) {

        // constructor = special method that is called when an object  is instantiated (created)
        
        Human human = new Human("rick",65,70);
        Human human2 = new Human("morty",25,65);

        System.out.println(human.name);
        human2.eat();



    }

    static public class Human{
        String name;
        int age;
        double weight;

        Human(String name, int age, double weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        void eat()
        {
            System.out.println(name + " is eating");
        }

        void drink()
        {
            System.out.println(name + " is drinking");
        }
    }
}