package ex09;

public abstract class Character {
    private final String name;
    protected int health;
    protected int maxHealth;
    protected int stamina;
    protected int maxStamina;
    protected int mana;
    protected int maxMana;
    protected double baseAttackDamage;
    private boolean alive = true;
    private SkillSet skillSet;

    public Character(String name, int maxHealth, int maxStamina, int maxMana, double baseAttackDamage){
        if(name == null)
            throw new IllegalArgumentException("Name cannot be null.");

        if(maxHealth <= 0 || maxStamina <= 0 || maxMana <= 0 || baseAttackDamage <= 0)
            throw new IllegalArgumentException("The atributes cannot be less or equal to 0.");
        
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.maxStamina = maxStamina;
        this.stamina = maxStamina;
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.baseAttackDamage = baseAttackDamage;

        skillSet = new SkillSet();
    }

    public String getName(){
        return name;
    }

    //De implementat in Warrior and Mage
    protected abstract boolean canLearnSkill(Skill skill);

    //Verifica daca skill != null daca clasa caracterului(Warrios/Mage) poate
    //invata acest skill si daca da verifica daca l-a invatat deja. Adauga daca 
    //nu l-a invatat deja.
    public void learnSkill(Skill skill){
        if(skill != null)
            if(canLearnSkill(skill) == true)
                if(!skillSet.hasSkill(skill))
                    skillSet.addSkill(skill);
                else{
                    System.out.println("Character " + name + " knows already this skill.");
                    return;
                }
            else{
                System.out.println("Character " + name + " cannot learn this skill.");
                return;
            }
        else{
            System.out.println("Skill cannot be null.");
            return;
        }
    }

    public void performSkill(Skill skill, Character target){
        if(skill != null)
            if(skillSet.hasSkill(skill))
                if(skill.canBeUsedBy(this))
                    skill.use(this, target);
                else{
                    System.out.println("Skill cannot be used by this class.");
                    return;
                }
            else{
                System.out.println("The character didn't learn this skill yet.");
                return;
            }
        else{
            System.out.println("Skill cannot be null.");
            return;
        }
    }

    protected double calculateDamage(double baseDamage) {
        double variationFactor = 0.9 + Math.random() * 0.2; // untre 0.9 si 1.1
        double damage = baseDamage * variationFactor;
        
        if (Math.random() < 0.05) { // 5% sansa de crit
            damage *= 1.5;
        }

        return damage;
    }

        // Execută un atac de bază asupra țintei
    public void baseAttack(Character target) {
        double damage = calculateDamage(this.baseAttackDamage);
        target.takeDamage((int) damage);

        System.out.println(this.name + " attacks " + target.name + " for " + (int)damage + " damage.");
    }

    public boolean isAlive(){
        return alive;
    }

    public void takeDamage(int amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Amount cannot be less or equal to 0");

        health -= amount;
        if(health <= 0){
            health = 0;
            alive = false;
        }
    }

    public void rest(){
        health = Math.min(maxHealth, health + maxHealth / 10);
        stamina = Math.min(maxStamina, stamina + maxStamina / 10);
        mana = Math.min(maxMana, mana + maxMana / 10);

        System.out.println("The character " + name + " rested.\nHealth:\t\t" + health + "\nStamina:\t" + stamina + "\nMana:\t\t" + mana);
    }

    public void printStatus(){
        System.out.println("Name:\t\t" + name + 
            "\nHealth:\t\t" + health + "/" + maxHealth +
            "\nStamina:\t" + stamina + "/" + maxStamina +
            "\nMana:\t\t" + mana + "/" + maxMana +
            "\nSkillSet:\t" + skillSet
        );
    }
}
