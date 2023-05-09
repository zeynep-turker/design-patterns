package builder;

public class User {
	private final String name; // required
	private final String surname; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User: " + this.getName() + ", " + this.getSurname() + ", " + this.getAge() + ", " + this.getPhone() + ", " + this.getAddress();
	}

	public static class UserBuilder {
		private final String name;
		private final String surname;
		private int age;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.name = firstName;
			this.surname = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
}

