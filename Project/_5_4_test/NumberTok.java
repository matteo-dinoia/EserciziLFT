package _5_4_;

public class NumberTok extends Token {
	private int value;

	public NumberTok(int value) {
		super(Tag.NUM);
		this.value = value;
	}

	public String toString() {
		return "<" + tag + ", " + value + ">";
	}

	public int getValue(){
		return value;
	}
}
