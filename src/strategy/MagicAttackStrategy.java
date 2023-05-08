package strategy;

public class MagicAttackStrategy implements AttackStrategy {
	@Override
	public void attack(Character target) {
		System.out.println("Magic attack on " + target.getName());
	}
}


