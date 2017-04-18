package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la DAO JDBC";
	}

	@PostConstruct
	public void loagApresConstruction(){
		System.out.println("Après création Dao JDBC");
	}
	
	@PreDestroy
	public void logAvantDestruction(){
		System.out.println("Avant destruction Dao JDBC");
	}
}
