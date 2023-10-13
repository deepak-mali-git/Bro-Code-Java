public class SuperKeyword {
    public static void main(String[] args) {

        // super  = keyword refers to the superclass (parent) of an object
        //          very similar to this keyword

        Hero hero = new Hero("Batman",42,"$$$");
        Person person = new Person("spider man",22);

        System.out.println(person);
        System.out.println(hero.toString());

        
    }

}