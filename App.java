public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "Collei";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        Gear helmet = new Gear();

        helmet.name = "Knight's Helmet";
        helmet.defense = 20;
        helmet.weight = 9.5f;
        helmet.rarity = "Rare";
        helmet.description = "This Helmet have been through many battles over the centuries.";
        helmet.hasElementalResistance = true;
        
        helmet.showMyDescription();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();


    }
}
