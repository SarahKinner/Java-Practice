//Simple RPG maker character and mini fight game

//Create Character class
public class Character {
    String name;
    int health;
    int attackPower;

    //Constructor needed for the character when making it
    public Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    //Shows how character attacking the enemy is going to be handled
    public void attack(Character target) {
        target.health -= this.attackPower;

        System.out.println(this.name + " attacks " + target.name + " for " + this.attackPower + " damage!");
    }

    //Shows how the character will heal themselves
    public void heal() {
        this.health += 10;
    }

    //Check if the character is up and kicking still
    public boolean isAlive(){
        return this.health > 0;
    }
}

public class Classes_Functions {
    public static void main(String[] args) {
        //Make scanner object
        Scanner myObj = new Scanner(System.in);

        //Variables needed

        //Ask user for character's name
        System.out.println("What's the name of your character?"); 

        //User inputs the character's name
        String playername = myObj.nextLine();

        //Deciding character stats here
        int playerHealth = (int)(Math.random() * 21) + 80;
        int playerAttack = (int)(Math.random() * 11) + 15;


        //Deciding enemy stats here
        int enemyHealth = (int)(Math.random() * 21) + 80;
        int enemyAttack = (int)(Math.random() * 11) + 15;

        //Create character and enemy objects
        Character player = new Character(playername, playerHealth, playerAttack);
        Character enemy = new Character("Evil Creechure", enemyHealth, enemyAttack);

        //Print off the info of the character
        System.out.println(player.name + " - Health: " + player.health + ", Attack: " + player.attackPower);
        System.out.println(enemy.name + " - Health: " + enemy.health + ", Attack: " + enemy.attackPower);

        //Put a loop here for a fight off between the character and enemy
        while (player.isAlive() && enemy.isAlive()) {
            //Asks the user what they want to do
            System.out.println("Do you want to attack the enemy or heal yourself? (Type in attack or heal)");

            //Whatever the user inputs that'll be in the string for this loop
            String action = myObj.nextLine();

            //Action if user types in attack
            if (action.equalsIgnoreCase("attack")) {
                player.attack(enemy);
                //Action if user types in heal
            } else if (action.equalsIgnoreCase("heal")) {
                player.heal();
                //Action if user goofs up with typing
            } else{
                System.out.println("Womp womp you lose a turn! Get better at typing next time.");
            }

            //Checks if the enemy is alive and if it is it attacks
            if (enemy.isAlive()) {
                enemy.attack(player);
            }

            //Prints out the health for both the character and enemy after they both have a turn



        }

    //After the loop do a if else statement to show if they win or lose
    }
}
