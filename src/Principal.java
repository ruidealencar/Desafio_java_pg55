import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#.0");
		Turma t1 = new Turma();
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		t1.setAluno1(JOptionPane.showInputDialog("ALUNO(A) 1:"));
		t1.setAluno2(JOptionPane.showInputDialog("ALUNO(A) 2:"));
		t1.setAluno3(JOptionPane.showInputDialog("ALUNO(A) 3:"));
		
		double notaParcial_1Aluno1 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 1 "+t1.getAluno1())));
		double notaInst_1Aluno1 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucional 1 "+t1.getAluno1())));
		double np1Aluno1 = a1.calcularNotaTotal(notaParcial_1Aluno1, notaInst_1Aluno1);
		double notaParcial_2Aluno1 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 2 "+t1.getAluno1())));
		double notaInst_2Aluno1 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucuinal 2 "+t1.getAluno1())));
		double np2Aluno1 = a1.calcularNotaTotal(notaParcial_2Aluno1, notaInst_2Aluno1);
		double mediaGeralAuno1 = a1.calcularMediaGeral(np1Aluno1, np2Aluno1);
		System.out.println(np1Aluno1);
		System.out.println(np2Aluno1);
		
		double notaParcial_1Aluno2 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 1 "+t1.getAluno2())));
		double notaInst_1Aluno2 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucional 1 "+t1.getAluno2())));
		double np1Aluno2 = a2.calcularNotaTotal(notaParcial_1Aluno2, notaInst_1Aluno2);
		double notaParcial_2Aluno2 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 2 "+t1.getAluno2())));
		double notaInst_2Aluno2 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucuinal 2 "+t1.getAluno2())));
		double np2Aluno2 = a2.calcularNotaTotal(notaParcial_2Aluno2, notaInst_2Aluno2);
		double mediaGeralAluno2 = a2.calcularMediaGeral(np1Aluno2, np2Aluno2); 
		
		double notaParcial_1Aluno3 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 1 "+t1.getAluno3())));
		double notaInst_1Aluno3 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucional 1 "+t1.getAluno3())));
		double np1Aluno3 = a3.calcularNotaTotal(notaParcial_1Aluno3, notaInst_1Aluno3);
		double notaParcial_2Aluno3 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Parcial 1 "+t1.getAluno3())));
		double notaInst_2Aluno3 = a1.setNotaParte1(Double.parseDouble(JOptionPane.showInputDialog("Nota Institucional 1 "+t1.getAluno3())));
		double np2Aluno3 = a3.calcularNotaTotal(notaParcial_2Aluno3, notaInst_2Aluno3);
		double mediaGeralAluno3 = a3.calcularMediaGeral(np1Aluno3, np2Aluno3);
		
		System.out.println("MÉDIA ALUNO(A) "+t1.getAluno1()+": "+df.format(mediaGeralAuno1));
		System.out.println("MÉDIA ALUNO(A) "+t1.getAluno2()+": "+df.format(mediaGeralAluno2));
		System.out.println("MÉDIA ALUNO(A) "+t1.getAluno3()+": "+df.format(mediaGeralAluno3));
		
		System.out.println("MÉDIA DA TURMA: "+ df.format(t1.calcularMedia(mediaGeralAuno1, mediaGeralAluno2, mediaGeralAluno3)));
		

	}

}
