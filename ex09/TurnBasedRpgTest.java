package ex09;

public class TurnBasedRpgTest {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("Arin");
		Mage mage = new Mage("Mira");

		Skill powerStrike = new PowerStrike();
		Skill iceBlast = new IceBlast();
		Skill swiftBlow = new SwiftBlow();

		warrior.learnSkill(powerStrike);
		warrior.learnSkill(swiftBlow);
		warrior.learnSkill(iceBlast);

		mage.learnSkill(iceBlast);
		mage.learnSkill(swiftBlow);

		System.out.println("=== Initial status ===");
		warrior.printStatus();
        System.out.println();
		mage.printStatus();

		System.out.println("\n=== Battle ===");
		warrior.baseAttack(mage);
		mage.performSkill(iceBlast, warrior);
		warrior.performSkill(powerStrike, mage);
		mage.performSkill(swiftBlow, warrior);

		System.out.println("\n=== Status after battle ===");
		warrior.printStatus();
        System.out.println();
		mage.printStatus();

		System.out.println("\n=== Rest ===");
		warrior.rest();
        System.out.println();
		mage.rest();
	}
}
