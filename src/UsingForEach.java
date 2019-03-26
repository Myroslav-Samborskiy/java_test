public class UsingForEach {
    public static void main(String[] args) {
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        System.out.println("Using conventional For Loop:");
        for (int i = 0; i < arrData.length; i++) {
            System.out.println(arrData[i]);
        }
        System.out.println("\nUsing Foreach loop:");
        for (String strTemp : arrData) {
            System.out.println(strTemp);
        }

    }
}
