package adapter;

public class CryptB implements Crypt {
	public void encrypt(String text) {
		System.out.println(text + " is encrypted with CryptB");
	}

	public void decrypt(String text) {
		System.out.println(text + " is decrypted with CryptB");
	}
}




