package games.equipments;

public enum EquipmentRarity {
    ORDINARY_EQUIPMENT("ordinary",500),
    RARE_EQUIPMENT("rare",1000),
    ARTIFACT_EQUIPMENT("artifact",1500)
    ;
    private String rarity;
    private int price;

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

    EquipmentRarity(String rarity, int price) {
        this.rarity = rarity;
        this.price = price;
    }
}
