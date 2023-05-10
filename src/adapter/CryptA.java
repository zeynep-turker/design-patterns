package adapter;

public class CryptA implements Crypt {
	@Override
	public void encrypt(String text) {
		System.out.println(text + " is encrypted with CryptA");
	}

	@Override
	public void decrypt(String text) {
		System.out.println(text + " is decrypted with CryptA");
	}
}



