package lautaro.JavaAnotattions;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado {

	public String getEmail() {
		return email;
	}

	public String getNombreDeLaEmpresa() {
		return nombreDeLaEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y dirección de las operaciones";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreDeLaEmpresa;

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

}
