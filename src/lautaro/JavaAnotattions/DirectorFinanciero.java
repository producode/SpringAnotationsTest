package lautaro.JavaAnotattions;

public class DirectorFinanciero implements Empleado {

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

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

}
