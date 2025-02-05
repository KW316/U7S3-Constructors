package partB;

public class Constructor {
    String name = "";

    public Constructor(String str){
        this.name = str;
        System.out.println("The constructor is called");

    }
    public static String Constructor() {
        String response = "";
        String name = "";


        return response;
    }

    public static void main(String[] args) {

        Constructor one = new Constructor("Kianna");
        System.out.println("The name is " + one.name);
    }
}
