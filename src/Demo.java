public class Demo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.showData();
        student s2 = new student();
        s2.showData();
        student.b++;
        s1.showData();

    }
}

class student {
    int a;
    static int b;

    student() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
    public void  increment(){
        a++;
    }
}
