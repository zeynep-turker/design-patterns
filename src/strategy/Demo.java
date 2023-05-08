package strategy;

public class Demo {
	public static void main(String[] args) {
		Character character = new Character("Player", new SwordAttackStrategy());
		Character enemy = new Character("Enemy", new BowAttackStrategy());

		character.attack(enemy);
		enemy.attack(character);

		character.setAttackStrategy(new MagicAttackStrategy());
		character.attack(enemy);
	}
}

