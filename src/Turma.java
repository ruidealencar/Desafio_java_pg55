
public class Turma 
{
	private String aluno1;
	private String aluno2;
	private String aluno3;
	public double calcularMedia(double meidaA1, double mediaA2, double mediaA3){
		double mediaTurma = (meidaA1 + mediaA2 + mediaA3)/3;
		return mediaTurma;
	}
	public String getAluno1() {
		return aluno1;
	}
	public void setAluno1(String aluno1) {
		this.aluno1 = aluno1;
	}
	public String getAluno2() {
		return aluno2;
	}
	public void setAluno2(String aluno2) {
		this.aluno2 = aluno2;
	}
	public String getAluno3() {
		return aluno3;
	}
	public void setAluno3(String aluno3) {
		this.aluno3 = aluno3;
	}
	

}
