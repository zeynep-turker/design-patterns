package adapter;

public class Adapter implements Crypt {
	private final CodeX codeX;

	public Adapter(CodeX codeX) {
		this.codeX = codeX;
	}

	public void encrypt(String text) {
		codeX.textToCode(text);
	}

	public void decrypt(String text) {
		codeX.codeToText(text);
	}
}







