public class Math {
    public static void main(String[] args) {
        int i1 = 27;
        int i2 = -45;
        double d1 = 84.6;
        double d2 = 0.45;

        System.out.println("Absolute value of i1: "+ java.lang.Math.abs(i1));
        System.out.println("Absolute value of i2: " + java.lang.Math.abs(i2));
        System.out.println("Absolute value of d1: "+ java.lang.Math.abs(d1));
        System.out.println("Absolute value of d2: " + java.lang.Math.abs(d2));

        System.out.println("Round off for d1: " + java.lang.Math.round(d1));
        System.out.println("Round off for d2: " + java.lang.Math.round(d2));

        System.out.println("Ceiling of '" + d1 + "' = " + java.lang.Math.ceil(d1));
        System.out.println("Floor of '" + d1 + "' = " + java.lang.Math.floor(d1));
        System.out.println("Ceiling of '" + d2 + "' = " + java.lang.Math.ceil(d2));
        System.out.println("Floor of '" + d2 + "' = " + java.lang.Math.floor(d2));

        System.out.println("\"Minimum out of '\" + i1 + \"' and '\" + i2 + \"' = " + java.lang.Math.min(i1,i2));


    }
}
