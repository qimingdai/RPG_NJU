package games.weapon;

public class BasicWeapon {
    private int level;
    private String name;
    private int strength;
    private int intelligence;
    private int physicAttack;
    private int magicAttack;
    private String rarity;
    private int price;
    private float rate;
    private int reinforce;

    public void calExtraAttack(int level){
        int addPhysic = level*100;
        int addMagic = level*100;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setPhysicAttack(int physicAttack) {
        this.physicAttack = physicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setReinforce(int reinforce) {
        this.reinforce = reinforce;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPhysicAttack() {
        return physicAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public String getRarity() {
        return rarity;
    }

    public int getPrice() {
        return price;
    }

    public float getRate() {
        return rate;
    }

    public int getReinforce() {
        return reinforce;
    }
}
