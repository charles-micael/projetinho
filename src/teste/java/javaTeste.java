package teste.java;

import javax.swing.JOptionPane;

import aulaJava.Aluno;

public class javaTeste {
	/*main e um metodo auto executavel em Java*/
	public static void main (String [] args ) {
		/*objeto nao exixte na memoria */
		String nome =  JOptionPane.showInputDialog("Qual e o nome do Aluno?");
		String idade  =  JOptionPane.showInputDialog("Qual e a sua idade?");
		String dataNacimento =  JOptionPane.showInputDialog("Data de nascimento?");
		String rg =  JOptionPane.showInputDialog("registro geral?");
		String Cpf =  JOptionPane.showInputDialog("numero do Cpf?");
		String mae =  JOptionPane.showInputDialog("Nome da mae ?");
		String Pai =  JOptionPane.showInputDialog("Nome do pai?");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNacimento(dataNacimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(Pai);
		aluno1.setDataMatricula("21/08/2019");
		aluno1.setSerieMatriculado("2222");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		System.out.println("nome e ="+ aluno1.getNome());
		System.out.println("idade e = "+ aluno1.getIdade());
		System.out.println("datanascimento e = "+ aluno1.getDataNacimento());
		System.out.println("registroGeral e = " + aluno1.getRegistroGeral());
		System.out.println("numeroCpf e =" + aluno1.getNumeroCpf());
		System.out.println("nomeMae e =" + aluno1.getNomeMae());
		System.out.println("nomepai e = " + aluno1.getNomePai());
		System.out.println("dataNascimento e = " + aluno1.getDataMatricula());
		System.out.println("seriematricula e =" + aluno1.getSerieMatriculado());
		System.out.println("Media da nota e =" + aluno1.getmediaNota());
		System.out.println("resultado e = "+( aluno1.getalunoAprovado()? "aprovado" : "reprovado"));
		System.out.println("resultado 2  = e " + aluno1.getAlunoAprovado2());
		
		
		
		
	}
	

}
