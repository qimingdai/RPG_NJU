package games.equipments;

public enum EquipmentSuitName {
    ORDINARY_SUIT(1,"堕落的七宗罪"),
    RARE_SUIT(2,"光怪陆离的人生"),
    ARTIFACT_SUIT(4,"苍天之穹幕")
    ;
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setName(String name) {
        this.name = name;
    }

    EquipmentSuitName(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
