import java.util.HashMap;

public class Sample_TestMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");
        System.out.println("Tutorial in Guru99: " + map);
        map.remove(5);
        System.out.println("Tutorial in Guru99 After Remove: " + map);
        System.out.println("contains or no value '6'?: " + map.containsKey(6));
        System.out.println("contains key 'PHP'?: " + map.containsValue("PHP"));
        System.out.println("All keys: "+ map.keySet());
        System.out.println("All values: "+map.values());
    }
}
