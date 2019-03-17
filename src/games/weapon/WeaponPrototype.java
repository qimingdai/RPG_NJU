package games.weapon;

import java.util.HashMap;

public class WeaponPrototype {
    public static HashMap<Integer,BasicWeapon> hashMap = new HashMap<>();

    public static BasicWeapon getWeapon(Integer markId){
        return hashMap.get(markId).clone();
    }

    public static void loadPrototype(){
        OrdinarySword ordinarySword = new OrdinarySword();
        hashMap.put(ordinarySword.getMarkId(),ordinarySword);

        OrdinaryWand ordinaryWand = new OrdinaryWand();
        hashMap.put(ordinaryWand.getMarkId(),ordinaryWand);

        RareSword rareSword = new RareSword();
        hashMap.put(rareSword.getMarkId(),rareSword);

        RareWand rareWand = new RareWand();
        hashMap.put(rareWand.getMarkId(),rareWand);
    }


}
