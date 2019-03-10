package xadrez;

import boardgame.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}

	public PecaXadrez[][] pecas1() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getColunas()];
		for (int i = 0; i <tabuleiro.getLinha(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.pecas(i, j);
			}
		}
		return mat;
	}
}
