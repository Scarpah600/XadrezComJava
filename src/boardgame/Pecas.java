package boardgame;

public class Pecas {
	protected Posicao position;
	private Tabuleiro tabuleiro;

	public Pecas(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		this.tabuleiro = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
