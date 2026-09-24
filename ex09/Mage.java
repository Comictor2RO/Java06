package ex09;

public class Mage extends Character{
    Mage(String name){
        super(name, 90, 60, 120, 10.0);    
    }

    @Override 
    protected boolean canLearnSkill(Skill skill) {
        return skill.canBeUsedBy(this);
    }
}
