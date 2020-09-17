package entidadeexercicio1;

public class Empregado extends Proponente{
	public int setor;
	public double salarioBase;
	public double imposto;
	

	public Empregado(String nome, String endereco, String telefone, int setor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);
		this.setor = setor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public double calcularSalario() {
		return this.salarioBase - (this.salarioBase * this.imposto / 100);
	}
	public int getSetor() {
		return setor;
	}
	public void setCodigoSetor(int setor) {
		this.setor = setor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}