class JavaException3 {
    public static void main(String[] args) {
        try {
            throw new myException(2);

        }

        catch (myException e){
            System.out.println(e);
        }
    }
}

class myException extends Exception{
    int a;
    myException(int b){
        a = b;
    }

    public String toString(){
        return ("Exception Number = "+a);
    }
}
