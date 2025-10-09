class Character {
    public void attack(){System.out.println("Generic attack");}
}
class Warrior extends Character {
    public void attack(){System.out.println("Warrior attacks with sword!");}
}
class Mage extends Character {
    public void attack(){System.out.println("Mage casts fireball!");}
}
class Archer extends Character {
    public void attack(){System.out.println("Archer shoots arrow!");}
}
public class GameBattle {
    public static void main(String[] args) {
        Character[] army = {new Warrior(), new Mage(), new Archer()};
        for(Character c: army) c.attack();
    }
}
