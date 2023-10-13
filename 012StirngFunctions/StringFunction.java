public class StringFunction {
    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        //          reference data type have accesses to useful methods

        String name = "dk";
        
        
        // boolean result = name.equals("dk");
        // boolean result = name.equalsIgnoreCase("Dk");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("k"); 
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace("k","d");

        
        System.out.println(result);
        
    }
}