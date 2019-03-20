public class SampleString {
    public static void main(String[] args) {
        String str1 = "Rock";
        String str2 = "star";
        String str3 = str1.concat(str2);
        System.out.println("str3 - " + str3);
        System.out.println("lenght of string 'Rockstar is '" +str3.length());
        System.out.println("Character at position 5: " +str3.charAt(5));
        System.out.println("Index of character 's' is " + str3.indexOf("s"));

        String str_Sample ="RockStar";
        System.out.println("Compare to 'ROCKSTAR' : "+str_Sample.compareTo("rockstar"));
        System.out.println("Compare to 'ROCKSTAR' - Case Ignored: "+str_Sample.compareToIgnoreCase("ROCKSTAR"));

        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
        System.out.println("EndsWith character 'r' " + str_Sample.endsWith("r"));

        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
        System.out.println("Convert to lowerCase: " + str_Sample.toLowerCase());
        System.out.println("Convert to UpperCase: "+ str_Sample.toUpperCase());


    }
}
