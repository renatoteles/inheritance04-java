package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double imposto() {
		if ( getRenda() >= 20000) {
			if ( gastosSaude > 0) {
				return (getRenda() * 0.25) - (gastosSaude * 0.50);
			} else {
				return getRenda() * 0.25;
			}
		} else {
			if ( gastosSaude > 0) {
				return (getRenda() * 0.15) - (gastosSaude * 0.50);
			} else {
				return getRenda() * 0.15;
			}
		}
	}
	
}
