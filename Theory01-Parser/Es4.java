public class Es4 extends Parser {
	protected void S() {
		int peeked=peek();
		switch (peeked) {
			case '0': // S → 0...9
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				match(peeked);
				break;
			case '+': // S → +SS
				match('+');
				S();
				S();
				break;
			case '*': // S → *SS
				match('*');
				S();
				S();
				break;
			default:
				throw error();
		}
	}
}