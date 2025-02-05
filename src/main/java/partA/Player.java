package partA;

public class Player {

    //Fields
    public String name;
    public double height;
    public int yearsInLeague;

    //Constructor

    public Player(String name, double height, int yearsInLeague) {
        System.out.println("This is a constructor");
        this.name = name;
        this.height = height;
        this.yearsInLeague = yearsInLeague;
    }



    //Methods
    public void think(){
        System.out.println("I'll have my win.");
    }

    public void setFields(String a, double b, int c) {

    }

    public static void main(String[] args) {
        Player player = new Player("Jermainal", 24, 25);

        System.out.println(player.name);
        System.out.println(player.height);
        System.out.println(player.yearsInLeague);

        player.setFields("Jamar", 6.9,8);
    }
}
