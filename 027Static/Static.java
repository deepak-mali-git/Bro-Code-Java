public class Static {
    public static void main(String[] args) {

        // Static = modifier. A single copy of a variable /method is created  and  shred.
        //          The  class "owns" the static member

        Friend f1 = new Friend("A");
        Friend f2 = new Friend("B");
        Friend f3 = new Friend("C");

        System.out.println(f1 + " " + f2 + " " + f3);

        //System.out.println(Friend.numberOfFriends);

        Friend.display();
        
    }
}