package games.character;

import games.bag.Bag;
import games.skills.BasicSkill;

import java.util.List;

public class Wizard extends Role {
    private List<BasicSkill> skillList;
    private Bag bag;


    private static volatile Wizard wizard;


    private Wizard(){}

    public static Wizard getWizardInstance(){
        if(wizard==null){
            synchronized (Wizard.class){
                if(wizard==null){
                    wizard=new Wizard();
                }
            }
        }
        return wizard;
    }



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


}
