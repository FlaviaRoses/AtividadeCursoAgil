package br.com.mundodosfilmes.util;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Utils {

private static SessionFactory fabricaDeSessoes;
	
	public static SessionFactory getFabricaDeSessoes(){
			
		return fabricaDeSessoes;
	}
	
	public static SessionFactory criarFabricaDeSessoes(){
		try {
			Configuration configuracao = new Configuration().configure();
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica;
			
		} catch (Exception ex) {
			System.out.println("erro na criação da fabrica de sessões");
			throw new ExceptionInInitializerError(ex);
		}
	
		
	}
}
