package games.character;

import games.bag.Bag;
import games.skills.BasicSkill;

import java.util.List;

public class Warrior extends Role {
    private List<BasicSkill> skillList;
    private Bag bag;



    private static volatile Warrior warrior;

    public List<BasicSkill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<BasicSkill> skillList) {
        this.skillList = skillList;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }


    private Warrior(){}

    public static Warrior getWarriorInstance(){
        if(warrior==null){
            synchronized (Warrior.class){
                if(warrior==null){
                    warrior=new Warrior();
                }
            }
        }
        return warrior;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "skillList=" + skillList +
                ", bag=" + bag +
                ", HP=" + HP +
                ", physicAttack=" + physicAttack +
                ", magicAttack=" + magicAttack +
                ", physicDefence=" + physicDefence +
                ", magicDefence=" + magicDefence +
                '}';
    }
}
