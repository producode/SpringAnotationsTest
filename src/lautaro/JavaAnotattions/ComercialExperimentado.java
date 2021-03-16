package lautaro.JavaAnotattions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleado {
	
	public ComercialExperimentado() {
		
	}

	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/

	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender productos";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;

}
