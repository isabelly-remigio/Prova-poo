
public class Evento {
	private String nome;
	private String data;
	private double preco;
	private boolean remoto;
	
	public Evento(String nome, String data, double preco, boolean remoto) {
		this.nome = nome;
		this.data = data;
		this.preco = preco;
		this.remoto = remoto;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isRemoto() {
		return remoto;
	}

	public void setRemoto(boolean remoto) {
		this.remoto = remoto;
	}
	
	@Override
	public String toString() {
		return "Eventos: "+ nome + ", Data: " + data + ", Preço: " + preco + ", Status: " + (remoto ? "Remoto" : "Presencial");
	}
}
