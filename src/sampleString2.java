public class sampleString2 {
    public static void main(String[] args) {
        String str_Sample = "This is index of Example";
        System.out.println("Index of 'x' is: " + str_Sample.indexOf("x"));
        System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 3));
        System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
        System.out.println("Index of substring 'is' form index: " + str_Sample.indexOf("is", 5));
    }
}
