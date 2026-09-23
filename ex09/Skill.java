package ex09;

public interface Skill {
    String getName();
    double getBaseDamage();
    int getStaminaCost();
    int getManaCost();

    boolean canBeUsedBy(Character c);

    void use(Character attacker, Character target);
}