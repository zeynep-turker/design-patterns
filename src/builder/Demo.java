package builder;

public class Demo {
	public static void main(String[] args)
	{
		User user1 = new User.UserBuilder("Zeynep", "Türker")
				.age(25)
				.phone("05075869595")
				.address("Harmandere Mah. Site Sok. No: 6/2 Birkent Sitesi A Blok Daire 10")
				.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Çağla", "Şen")
				.age(24)
				.phone("05075965656")
				//no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Nazire", "Türker")
				//No age
				//No phone
				//no address
				.build();

		System.out.println(user3);
	}
}


