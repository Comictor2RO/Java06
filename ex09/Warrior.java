package ex09;

public class Warrior extends Character{
    Warrior(String name){
        super(name, 150, 100, 10, 12.0);    
    }

    @Override 
    protected boolean canLearnSkill(Skill skill) {
        return skill.canBeUsedBy(this);
    }
}
