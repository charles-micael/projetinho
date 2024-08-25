package aulaJava;
/*esta e nossa  classe/objeto que representa o Aluno */
public class Aluno {
	public String nome;
	public int idade ;
	private String dataNacimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscolar;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	private Diciplina diciplina = new Diciplina ();
	public void setDiciplina(Diciplina diciplina) {
		this.diciplina = diciplina;
	}
	public Diciplina getDiciplina() {
		return diciplina;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
		
	}
	public Aluno (String nomePadrao,int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		
	}
	/*veremos os metodos setters e getters do objetos = "serve para receber dados"*/
	/*set e para adicionar ou receber dados do  atributos*/
	/*Get e para resgatar ou obter o valor do atributos*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscolar() {
		return nomeEscolar;
	}
	public void setNomeEscolar(String nomeEscolar) {
		this.nomeEscolar = nomeEscolar;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	/* metodo que retorna  a media do aluno */
	public double getmediaNota() {
		return (diciplina.getNota1() + diciplina.getNota2() + diciplina.getNota3() + diciplina.getNota4() )/4;
		
	}
	public boolean getalunoAprovado() {
		double media = this.getmediaNota();
		if(media >= 70) {
			return true;
			
		}else {
			return false;
			
		}
	}
	public String  getAlunoAprovado2(){
	double media = this.getmediaNota();
	if (media >= 70) {
		return "Aluno esta aprovado";
		
	}else {
		return "O Aluno Esta reprovado ";
		
	}
			}
	@Override
	public String toString() {
		return "O aluno foi reprovado ";
	}
	
}
