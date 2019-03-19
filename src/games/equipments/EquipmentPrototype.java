package games.equipments;

import java.util.HashMap;

public class EquipmentPrototype {
    private static HashMap<Integer,BaseEquipment> hashMap = new HashMap<>();
    public static BaseEquipment getEquipmentPrototype(int markId){
        return hashMap.get(markId).clone();
    }

    public static void loadPrototype(){
        ChestOrdinaryEquipment1 coe1 = new ChestOrdinaryEquipment1();
        hashMap.put(coe1.getMarkId(),coe1);

        ChestRareEquipment2 cre2 = new ChestRareEquipment2();
        hashMap.put(cre2.getMarkId(),cre2);

        ChestArtifactEquipment3 cae3 = new ChestArtifactEquipment3();
        hashMap.put(cae3.getMarkId(),cae3);


        HeadOrdinaryEquipment1 hoe1 = new HeadOrdinaryEquipment1();
        hashMap.put(hoe1.getMarkId(),hoe1);

        HeadRareEquipment2 hre2 = new HeadRareEquipment2();
        hashMap.put(hre2.getMarkId(),hre2);

        HeadArtifactEquipment3 hae3 = new HeadArtifactEquipment3();
        hashMap.put(hae3.getMarkId(),hae3);


        LegOrdinaryEquipment1 loe1 = new LegOrdinaryEquipment1();
        hashMap.put(loe1.getMarkId(),loe1);

        LegRareEquipment2 lre2 = new LegRareEquipment2();
        hashMap.put(lre2.getMarkId(),lre2);

        LegArtifactEquipment3 lae3 = new LegArtifactEquipment3();
        hashMap.put(lae3.getMarkId(),lae3);
    }

    public static void main(String[] args){
        EquipmentPrototype.loadPrototype();
        //苍穹之天幕
        int markId13=20;//头肩
        int markId23=36;//胸甲
        int markId33=52;//腿甲

        //七宗罪
        int markId11=17;//头肩
        int markId21=33;//胸甲
        int markId31=49;//腿甲

        BaseEquipment be11 = EquipmentPrototype.getEquipmentPrototype(markId11);
        BaseEquipment be21 = EquipmentPrototype.getEquipmentPrototype(markId21);
        BaseEquipment be31 = EquipmentPrototype.getEquipmentPrototype(markId31);

        BaseEquipment be13 = EquipmentPrototype.getEquipmentPrototype(markId13);
        BaseEquipment be23 = EquipmentPrototype.getEquipmentPrototype(markId23);
        BaseEquipment be33 = EquipmentPrototype.getEquipmentPrototype(markId33);

        BaseEquipment[] equipments = new BaseEquipment[3];
        equipments[0]=be13;
        equipments[1]=be23;
        equipments[2]=be33;

        boolean flag=true;
        for(int i=0;i<equipments.length;i++){
            System.out.println(equipments[i].getPartInfo());
            if(equipments[0].getSuitInfo().getNumber()!=equipments[i].getSuitInfo().getNumber()){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("它们不是一套装备");
        }else{
            System.out.println("这是"+equipments[0].getSuitInfo().getName()+"套装");
        }
    }
}
