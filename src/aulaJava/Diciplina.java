package aulaJava;

import java.util.Objects;

public class Diciplina {
	private double nota1;
	private String Diciplina1;
	private double nota2;
	private String Diciplina2;
	private double nota3;
	private String Diciplina3;
	private double nota4;
	private String Diciplina4;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public String getDiciplina1() {
		return Diciplina1;
	}
	public void setDiciplina1(String diciplina1) {
		Diciplina1 = diciplina1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getDiciplina2() {
		return Diciplina2;
	}
	public void setDiciplina2(String diciplina2) {
		Diciplina2 = diciplina2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public String getDiciplina3() {
		return Diciplina3;
	}
	public void setDiciplina3(String diciplina3) {
		Diciplina3 = diciplina3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public String getDiciplina4() {
		return Diciplina4;
	}
	public void setDiciplina4(String diciplina4) {
		Diciplina4 = diciplina4;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Diciplina1, Diciplina2, Diciplina3, Diciplina4, nota1, nota2, nota3, nota4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diciplina other = (Diciplina) obj;
		return Objects.equals(Diciplina1, other.Diciplina1) && Objects.equals(Diciplina2, other.Diciplina2)
				&& Objects.equals(Diciplina3, other.Diciplina3) && Objects.equals(Diciplina4, other.Diciplina4)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}
	

}
