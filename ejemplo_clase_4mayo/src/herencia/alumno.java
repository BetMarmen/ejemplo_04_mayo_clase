package herencia;

import javax.swing.JOptionPane;

public class alumno extends persona{
	private String matricula;

	

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public alumno(String nombre, String apellido, String nacionalidad, int edad, String matricula) {
		super(nombre, apellido, nacionalidad, edad);
		
	}

	
		// TODO Auto-generated constructor stub
	
	public void MostrarDatos()
	{
		JOptionPane.showMessageDialog(null, "Alumno:"+"\n"+getNombre()+"\n"+getApellido()+"\n"+getNacionalidad()+"\n"+getEdad()+"\n"+getMatricula());
	}


		
}
