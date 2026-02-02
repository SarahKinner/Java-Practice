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
    //Make scanner object
    
    //Ask user for character's name 

    //User inputs the character's name

    //Enemy character with stats here

    //Print off the info of the character

    //Put a loop here for a fight off between the character and enemy

    //After the loop do a if else statement to show if they win or lose
}
