
public class Aluno extends Prova
{
	private double prova1;
	private double prova2;
	
	
	public double calcularMediaGeral(double media1,double media2){
		double mediaGeral = (media1 + media2)/2;
		return mediaGeral;
	}
	public double getProva1() {
		return prova1;
	}
	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}
	public double getProva2() {
		return prova2;
	}
	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}
	

}
