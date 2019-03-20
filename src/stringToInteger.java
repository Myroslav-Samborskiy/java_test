public class stringToInteger {
    public static void main(String[] args) {
        String strTest = "100";
        int iTest = Integer.parseInt(strTest);
        System.out.println("actual string: " + strTest);
        System.out.println("converted to Int: " + iTest);
        System.out.println("arithmetic operation on Int: " + (iTest / 4));
    }
}
