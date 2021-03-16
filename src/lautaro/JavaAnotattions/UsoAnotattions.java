package lautaro.JavaAnotattions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotattions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado Antonio=contexto.getBean("comercialExperimentado", Empleado.class);
		
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		System.out.println();
		
		contexto.close();
	}

}
