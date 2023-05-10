package adapter;

public class Demo {
	public static void main(String[] args) {
		Crypt crypt = new CryptA();
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");

		crypt = new CryptB();
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");

		CodeX codeX = new CodeX();
		crypt = new Adapter(codeX);
		crypt.encrypt("Zeynep");
		crypt.decrypt("Çağla");
	}
}



