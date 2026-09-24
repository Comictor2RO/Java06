package ex09;

public class SwiftBlow implements Skill{
    private final String name;
    private final double baseAttackDamage;
    private final int staminaCost;
    private final int manaCost;

    SwiftBlow(){
        name = "Swift Blow";
        baseAttackDamage = 9.5;
        staminaCost = 3;
        manaCost = 3;
    }

    @Override 
    public String getName(){
        return name;
    }

    @Override 
    public double getBaseDamage(){
        return baseAttackDamage;
    }

    @Override 
    public int getStaminaCost(){
        return staminaCost;
    }

    @Override 
    public int getManaCost(){
        return manaCost;
    }

    @Override 
    public boolean canBeUsedBy(Character c){
        return true;
    }

    @Override 
    public void use(Character attacker, Character target){
        double damage;
        if(attacker.stamina >= staminaCost && attacker.mana >= manaCost){
            attacker.stamina -= staminaCost;
            attacker.mana -= manaCost;
            damage = getBaseDamage();
        }
        else
            damage = attacker.baseAttackDamage;

        double variationFactor = 0.9 + Math.random() * 0.2; //variaza intre 0.9 si 1.1
        damage *= variationFactor;

        if(Math.random() < 0.05){ //5% sansa de crit
            damage *= 1.5;
        }

        target.takeDamage((int) damage);
        System.out.println(attacker.getName() + " uses Swift Blow on " + target.getName() + " for " + (int)damage + " damage.");
    }
}
