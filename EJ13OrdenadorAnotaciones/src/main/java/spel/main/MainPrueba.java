package spel.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spel.cfg.ApplicationConfig;
import spel.entity.Computer;

public class MainPrueba {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Computer c = new Computer();
		System.out.println(c);
	}
}
