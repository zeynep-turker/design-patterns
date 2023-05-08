package strategy;

public class SwordAttackStrategy implements AttackStrategy {
	@Override
	public void attack(Character target) {
		System.out.println("Sword attack on " + target.getName());
	}
}


