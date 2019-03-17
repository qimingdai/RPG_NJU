package games.weapon;

public enum WeaponRarity {
    ORDINARY_WEAPON("ordinary",1000),
    RARE_WEAPON("rare",2000),
    ARTIFACT_WEAPON("artifact",3000)
    ;
    private String rarity;
    private int price;


    WeaponRarity(String rarity, int price) {
        this.rarity = rarity;
        this.price = price;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
