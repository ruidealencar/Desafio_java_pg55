
public class Prova 
{
	private double notaParte1;
	private double notaParte2;
	public double calcularNotaTotal(double notaParte1,double notaParte2){
		double notaTotal = (notaParte1 + notaParte2)/2;
		return notaTotal;
		
	}
	public double getNotaParte1() {
		return notaParte1;
	}
	public double setNotaParte1(double notaParte1) {
		return this.notaParte1 = notaParte1;
	}
	public double getNotaParte2() {
		return notaParte2;
	}
	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}
	

}
