interface Pet{
    public void test();
}
class dog implements Pet{
    public void test(){
        System.out.println("Interface Method Implemented");
    }
    public static void main(String args[]){
        Pet p = new dog();
        p.test();
    }
}
