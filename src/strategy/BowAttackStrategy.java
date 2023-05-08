package strategy;

public class BowAttackStrategy implements AttackStrategy {
	@Override
	public void attack(Character target) {
		System.out.println("Bow attack on " + target.getName());
	}
}


