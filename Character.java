public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name); 
    }
     public void sayMyStrength() {    
        System.out.println("Strength: " + strength);
    }
    public void sayMyAgility() {
        System.out.println("Agility: " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("Intelligence: " + intelligence + "\n");

    }
}