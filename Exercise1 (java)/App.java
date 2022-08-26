public class App {
    public static void main(String[] args) throws Exception {

        // Character Class with Constructor

        System.out.print("-----Characters-----\n");

        Character knight = new Character(10, 5, 0, "Chen");

        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character(0, 5, 10, "Akasha");

        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character(5, 10, 0, "Gondar");

        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        // Enemy Class without Constructor

        System.out.print("\n-----Enemies-----\n");

        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

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

        // Exercise 1
        // Weapon Class with Constructor

        System.out.print("\n-----Weapon-----\n");

        Weapon sword = new Weapon("Dull Blade", 1000000, 3, "common", "The common yet mythical sword that the hero uses to slay his enemies.");
        sword.weaponDescription();

        Weapon catalyst = new Weapon("The Widsith", 510, 2, "Rare", "A book filled with musical scores powered by the hand-written notes within.");
        catalyst.weaponDescription();

        Weapon bow = new Weapon("Amos' Bow", 600, 5, "Legendary", "An extremely ancient bow that draws power from everything existing.");
        bow.weaponDescription();

    }
}
