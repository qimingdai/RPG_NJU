package games.equipments;

public enum EquipmentPartName {
    HEAD_PART(1,"头肩"),
    CHEST_PART(2,"胸甲"),
    LEG_PART(3,"腿甲")
    ;
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    EquipmentPartName(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
