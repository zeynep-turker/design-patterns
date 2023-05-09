package adapter;

public class CodeXAdapter implements Crypt {
	private final CodeX codeX;

	public CodeXAdapter(CodeX codeX){
		this.codeX = codeX;
	}

	public void encrypt(String text) {
		codeX.textToCode(text);
	}

	public void decrypt(String text) {
		codeX.codeToText(text);
	}
}
