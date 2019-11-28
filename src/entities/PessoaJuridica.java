package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, int numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		if (numeroFuncionarios > 10) {
			return getRenda() * 0.14;
		} else {
			return getRenda() * 0.16;
		}
	}
}
