package LAB5;

import java.util.Scanner;
public class Players {
    protected String Name;
    protected int Age;
    protected String Position;

    public Players(String Name, int Age, String Position){
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
    }

    public void display(){
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.Age);
        System.out.println("Position: "+this.Position);
    }
    

    public void play(){
        System.out.println(Name + " is Playing");
    }

    public void train(){
        System.out.println(Name + " is Training");
    }
}
    class Cricket_Player extends Players {
        public Cricket_Player(String Name, int Age, String Position){
            super(Name, Age, Position);
        }

        public void play() {
            System.out.println(Name + " is playing a cricket match.");
        }

        public void train() {
            System.out.println(Name + " is practicing in Nets.");
        }
    }

    class Football_Player extends Players{
        public Football_Player(String Name, int Age, String Position){
            super(Name, Age, Position);
        }

        public void play() {
            System.out.println(Name + " is playing a football match.");
        }

        public void train() {
            System.out.println(Name + " is training his shooting skills.");
        }
}

    class Hockey_Player extends Players{
        public Hockey_Player(String Name, int Age, String Position){
            super(Name, Age, Position);    
        }

        public void play() {
            System.out.println(Name + " is playing a hockey match.");
        }

        public void train() {
            System.out.println(Name + " is practicing stick holding skills.");
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player's Name: ");
        String name = sc.nextLine();

        System.out.println("Enter player's Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter player's Position: ");
        String position = sc.nextLine();
        sc.nextLine();


        System.out.println("Enter the sport (Cricket, Football, Hockey): ");
        String sport = sc.nextLine();

         Players player = null;

        switch (sport.toLowerCase()) {
            case "cricket":
                player = new Cricket_Player(name, age, position);
                break;
            case "football":
                player = new Football_Player(name, age, position);
                break;
            case "hockey":
                player = new Hockey_Player(name, age, position);
                break;
            default:
                System.out.println("Invalid sport type.");
                break;
        }

        if (player != null) {
            player.display();
            player.play();
            player.train();
        }

        sc.close();
    }
}
