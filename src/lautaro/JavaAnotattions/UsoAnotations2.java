package lautaro.JavaAnotattions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xml de configuracion
		
		//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//class de configuracion
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		/*
		Empleado Juan = contexto.getBean("directorFinanciero", Empleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		*/
		
		DirectorFinanciero marcelo=contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(marcelo.getEmail());
		System.out.println(marcelo.getNombreDeLaEmpresa());
		
		contexto.close();
	}

}
