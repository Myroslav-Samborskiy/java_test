import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Test_ArrayList {
    public static void main(String[] args) {
        ArrayList arlTest = new ArrayList();
        System.out.println("Size of array list after creation is: " + arlTest.size());
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");
        System.out.println("Size of array list after adding elements is: " + arlTest.size());
        System.out.println("List of all elements: " + arlTest);

        arlTest.remove("D");
        System.out.println("Size of array list after removing one element is: " + arlTest);

        arlTest.remove(2);
        System.out.println("Size of array list after removing element by index is: " + arlTest);

        System.out.println(arlTest.contains("K"));



    }
}
