package dio.com.br;

//classe Veiculo2
public abstract class Veiculo2 {
	private String placa;
	private int ano;
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setAno(String ano) {
		this.ano = Integer.parseInt(ano);
	}
	
	public abstract void exibirDados();
}
