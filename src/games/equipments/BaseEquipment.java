package games.equipments;

public class BaseEquipment implements Cloneable{
    protected String name;
    protected int physicDefence;
    protected int magicDefence;
    protected EquipmentRarity equipmentRarity;

    @Override
    protected BaseEquipment clone() {
        BaseEquipment be = null;
        try{
            be = (BaseEquipment) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return be;
    }
}
