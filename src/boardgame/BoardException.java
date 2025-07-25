package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg); // leva a mensagem de excesão para o construtor da super classe
	}

}
