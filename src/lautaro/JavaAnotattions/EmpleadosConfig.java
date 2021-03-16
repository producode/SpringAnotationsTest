package lautaro.JavaAnotattions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("lautaro.JavaAnotattions")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	// definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleado directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
