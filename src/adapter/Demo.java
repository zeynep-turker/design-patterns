package adapter;

public class Demo {
	public static void main(String[] args) {
		Crypt crypt = new CryptA();
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");

		System.out.println("-------------");

		crypt = new CryptB();
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");

		System.out.println("-------------");

		CodeX codeX = new CodeX();

		crypt = new CodeXAdapter(codeX);
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");
	}
}
