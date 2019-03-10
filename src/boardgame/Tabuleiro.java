package boardgame;

public class Tabuleiro {

	private int linha;
	private int colunas;
	private Pecas[][] pecas;
	public Tabuleiro(int linha, int colunas) {
		this.linha = linha;
		this.colunas = colunas;
		pecas = new Pecas[linha][colunas];
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	
	
	
}
