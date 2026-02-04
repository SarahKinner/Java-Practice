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